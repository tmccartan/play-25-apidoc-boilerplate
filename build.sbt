import _root_.sbt.Keys._

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"