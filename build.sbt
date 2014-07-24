organization := "com.nparry"

name := "orderly"

version := "1.0.6-SNAPSHOT"

description := "An implementation of Orderly JSON (http://orderly-json.org/) for use on the JVM"

licenses += "BSD license" -> url("http://www.opensource.org/licenses/bsd-license.php" )

libraryDependencies ++= (scalaBinaryVersion.value match {
  case "2.10" => Seq(
    "net.liftweb" %% "lift-json" % "2.5",
    "org.specs2" %% "specs2" % "2.3.13" % "test")
  case "2.11" => Seq(
    "net.liftweb" %% "lift-json" % "2.6-M4",
    "org.specs2" %% "specs2" % "2.3.13" % "test")
})

crossScalaVersions := Seq("2.10.4", "2.11.2")

publishMavenStyle := true

publishTo <<= (version) { version: String =>
  val repo = if (version endsWith "SNAPSHOT") "snapshot" else "release"
    if (version endsWith "SNAPSHOT") "snapshot" else "release"
    Some("Rhinofly Internal " + repo.capitalize + " Repository" at "http://maven-repository.rhinofly.net:8081/artifactory/libs-" + repo + "-local")
}


