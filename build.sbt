scalaVersion := "2.11.7"
libraryDependencies += "org.subscript-lang" %% "subscript-swing" % "3.0.3"
SubscriptSbt.projectSettings

initialCommands := """
import java.awt._
import java.awt.event._

import lolspam._
import Main._
"""