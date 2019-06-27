name := "platform-config-web"

enablePlugins(ScalaJSPlugin)

val scala212 = "2.12.8"
val scala213 = "2.13.0"

scalaVersion := scala212

crossScalaVersions := Seq(scala212, scala213)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

libraryDependencies += "scalajs-react-interface" %%% "universal" % "2019.06.26" % Provided

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"

publishArtifact in Test := false

resolvers ++= Seq(Resolver.bintrayRepo("scalajs-react-interface", "maven"),
  Resolver.bintrayRepo("scalajs-plus", "maven"))
scalaJSStage in Global := FastOptStage
