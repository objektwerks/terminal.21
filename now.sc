#!/usr/bin/env -S scala-cli project.scala

import java.time.Instant

import org.terminal21.client.*
import org.terminal21.client.components.*
import org.terminal21.client.components.std.*

Sessions.withNewSession(id = "now-id", name = "now"): session =>
  given ConnectedSession = session

  Paragraph(text = Instant.now.toString).render()
  session.leaveSessionOpenAfterExiting()