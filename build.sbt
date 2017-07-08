name := "platform-config-web"

//version := "2017.7.0-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.11"

val scala212 = "2.12.2"

scalaVersion := scala211

crossScalaVersions := Seq(scala211, scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

libraryDependencies += "scalajs-react-interface" %%% "universal" % "2017.7.9-RC" % Provided

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"

publishArtifact in Test := false

resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")
scalaJSStage in Global := FastOptStage
