import sbt._
import sbt.Keys._

object ScalasipBuild extends Build {

  lazy val scalasip = Project(
    id = "scala-sip",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scala-sip",
      organization := "org.fabianware",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.1"
      // add other settings here
    )
  )
}
