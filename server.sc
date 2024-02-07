#!/usr/bin/env -S scala-cli project.scala

//> using dep io.github.kostaskougios::terminal21-server:0.21

import org.terminal21.server.Terminal21Server

Terminal21Server.start(port = Some(7070))