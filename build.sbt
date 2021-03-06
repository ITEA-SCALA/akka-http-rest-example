lazy val commonSettings = Defaults.coreDefaultSettings ++ Formatting.formatSettings ++ Seq(
  organization := "com.shadowsmind",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := Dependencies.scalaLastVersion,
  scalacOptions ++= List("-unchecked", "-deprecation", "-encoding", "UTF8", "-feature")
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "Akka HTTP rest-example",
    libraryDependencies ++= Dependencies.core ++ Dependencies.test
  )
