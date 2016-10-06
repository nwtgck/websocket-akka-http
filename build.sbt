name := "websocket-akka-http"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaHttpVersion =  "2.4.11"

  Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaHttpVersion,
    "org.java-websocket" % "Java-WebSocket" % "1.3.0"
  )
}