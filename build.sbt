name := "websocket-akka-http"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaHttpVersion =  "2.0"
//  val akkaHttpVersion =  "2.4.6"

  Seq(
    "com.typesafe.akka" %% "akka-stream-experimental" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaHttpVersion,
    "org.java-websocket" % "Java-WebSocket" % "1.3.0"
  )
}