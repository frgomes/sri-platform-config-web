name := "platform-config-web"

//version := "2017.2.0-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.8"

val scala212 = "2.12.1"

scalaVersion := scala211

crossScalaVersions := Seq(scala211, scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

libraryDependencies += "scalajs-react-universe" %%% "universal" % "2017.3.22-beta" % Provided

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-universe"

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-universe")

bintrayRepository := "maven"

publishArtifact in Test := false

resolvers += Resolver.bintrayRepo("scalajs-react-universe", "maven")
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % Test
scalaJSStage in Global := FastOptStage
