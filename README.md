Scala CLI
---------
>Scala 3 CLI feature tests.

Script
------
1. scala-cli script.sc

Source
------
1. scala-cli compile app.scala
2. scala-cli run app.scala

Library
-------
1. scala-cli compile library.scala

ScalaJs
-------
1. scala-cli package --js scalajs.scala -o scalajs.js
2. node ./scalajs.js

Test
----
1. scala-cli test .
2. scala-cli test unit.test.scala

Package
-------
>Source file:
1. scala-cli package app.scala -o app
>Library file:
1. scala-cli package library.scala -o library.jar --library

Assembly
--------
1. scala-cli package app.scala -o app --assembly

GraalVM
-------
1. scala-cli package app.scala -o app --native-image

Run
---
>After packaging or assemblying app.scala, run:
1. ./app

Resources
---------
1. [Scala-CLI](https://scala-cli.virtuslab.org/)
2. [Exploring Scala-CLI, The new Scala Runner](https://medium.com/virtuslab/exploring-scala-cli-the-new-scala-runner-4b958245c2e0)
