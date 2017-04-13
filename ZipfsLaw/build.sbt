lazy val ZipfsLaw = (project in file(".")).
  settings(
    name := "ZipfsLaw",
    version := "1.0",
    scalaVersion := "2.11.8",
    mainClass in Compile := Some("ZipfsLaw")
  )

libraryDependencies ++= Seq(
  //Spark
  // https://mvnrepository.com/artifact/org.apache.spark/spark-core_2.11
  "org.apache.spark" % "spark-core_2.11" % "2.1.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.1.0"
)
    