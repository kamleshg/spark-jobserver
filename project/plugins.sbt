addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")       // For quick restarts for web development

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.6.0")

resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.0.4")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.2.1")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.3")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.2.0")

resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

libraryDependencies ++= Seq(
	"spark.jobserver" % "job-server-api" % "0.5.0", 
	"org.scala-lang" % "scala-library" % "2.10.0",
	"com.datastax.cassandra" % "cassandra-driver-core" % "2.1.7.1",
	"org.apache.spark" % "spark-core_2.10" % "1.3.1",
	"org.apache.spark" % "spark-sql_2.10" % "1.3.1",
	"org.apache.spark" % "spark-streaming_2.10" % "1.3.1",
	"org.apache.spark" % "spark-catalyst_2.10" % "1.3.1",
	"com.datastax.spark" %% "spark-cassandra-connector" % "1.4.0-M3",
	"com.datastax.spark" %% "spark-cassandra-connector-java" % "1.4.0-M3"
)
