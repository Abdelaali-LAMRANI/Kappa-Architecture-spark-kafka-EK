import sbt._

object Dependencies {
  // Testing
  val munit = "org.scalameta" %% "munit" % "0.7.29" % Test

  // Kafka Dependencies
  val kafkaClients = "org.apache.kafka" % "kafka-clients" % "3.4.0"

  // Logging
  val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.10"

  // Scala Compatibility
  val scalaCollectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.10.0"

  // Circe for JSON
  val circeCore = "io.circe" %% "circe-core" % "0.14.3"
  val circeGeneric = "io.circe" %% "circe-generic" % "0.14.3"
  val circeParser = "io.circe" %% "circe-parser" % "0.14.3"

  // Elasticsearch
  val elasticsearchRestClient = "org.elasticsearch.client" % "elasticsearch-rest-high-level-client" % "7.17.13"
  // Configuration
  val commonConfig = "com.typesafe" % "config" % "1.4.1"

  // Akka Dependencies
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.2.10"
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % "2.9.0-M1"
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.9.0-M1"
  val akkaStreamKafka = "com.typesafe.akka" %% "akka-stream-kafka" % "4.0.0"
  val sparkCore = "org.apache.spark" %% "spark-core" % "3.5.0" % "provided"
  val sparkSql = "org.apache.spark" %% "spark-sql" % "3.5.0" % "provided"
  val sparkSqlKafka = "org.apache.spark" %% "spark-sql-kafka-0-10" % "3.5.0"
  // SLF4
  val slf4jApi = "org.slf4j" % "slf4j-api" % "1.7.32"
  val slf4jSimple = "org.slf4j" % "slf4j-simple" % "1.7.32"
}
