#!/usr/bin/env -S scala-cli project.scala

import java.time.Instant

import org.terminal21.client.{ConnectedSession, Sessions}
import org.terminal21.client.components.render
import org.terminal21.client.components.chakra.Button
import org.terminal21.client.components.std.Paragraph

Sessions.withNewSession(id = "now-id", name = "now"): session =>
  given ConnectedSession = session

  val datetime = () => s"Datetime: ${Instant.now.toString}"

  val paragraph = Paragraph(text = datetime())
  val button = Button(text = "Update").onClick{ () =>
    println("Button clicked!")
    paragraph.withText(datetime()).renderChanges() // Fails to update paragraph text!
  }

  Seq(paragraph, button).render()

  session.leaveSessionOpenAfterExiting()