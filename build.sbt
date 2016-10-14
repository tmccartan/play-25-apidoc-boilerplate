import _root_.sbt.Keys._

lazy val root = (project in file(".")).enablePlugins(PlayScala)
name := "play 2.5 boilerplate"
scalaVersion := "2.11.8"

lazy val thirdPartyDependencies: Seq[ModuleID] = Seq(
  play.sbt.PlayImport.ws withSources())


libraryDependencies ++= thirdPartyDependencies