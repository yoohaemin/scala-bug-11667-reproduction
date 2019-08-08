ThisBuild / scalaVersion     := "2.12.9"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-bug-11667-reproduction",
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-dsl" % "0.20.8"
    )
  )

scalacOptions in ThisBuild ++= Seq("-Ystatistics")

