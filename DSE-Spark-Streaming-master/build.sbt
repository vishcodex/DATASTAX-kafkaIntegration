name := "DSE-Spark-Streaming"

version := "1.0"

organization := "com.datastax"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.1.0" % "provided"

libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.1.0" % "provided"

libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector_2.10" % "1.1.1" % "provided"

libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector-java_2.10" % "1.1.1" % "provided"

libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.8.0" % "provided"

//We do this so that Spark Dependencies will not be bundled with our fat jar but will still be included on the classpath
//When we do a sbt/run
run in Compile <<= Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run))

assemblySettings
    