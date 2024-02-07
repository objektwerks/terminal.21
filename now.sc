#!/usr/bin/env -S scala-cli project.scala

import java.time.Instant

import org.terminal21.client.{ConnectedSession, Sessions}
import org.terminal21.client.components.std.Paragraph

Sessions.withNewSession(id = "now-id", name = "now"): session =>
  given ConnectedSession = session

  Paragraph(text = s"Datetime: ${Instant.now.toString}").render()
  session.leaveSessionOpenAfterExiting()