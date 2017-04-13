import org.apache.spark.sql.SparkSession

/**
  * Created by ppanero on 12/04/2017.
  */
object ZipfsLaw {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("Zipf's Law")
        .master("local[*]")
      .getOrCreate()
    val textFile = spark.sparkContext.textFile("src/main/resources/examplePost.txt")
    val words = textFile.flatMap(line => line.split(" ")).cache()

    //Get the occurences of the words (word count)
    val counts  = words
      .map(word => (word, 1))
      .reduceByKey(_ + _)
      .cache()

    // Get the total number of unique words in the text
    val total = counts.count()

    // Print occurrences
    val occurrences = counts.collect()
      .foreach(println)

    println(s"Total words: $total")

    // Calculate the amount of words for each occurrence amount
    val zipfLaw = counts
      .map(word =>(word._2, 1))
      .reduceByKey(_ + _)
      .sortByKey()
      .collect()
      .foreach(occurrence => println(s"${occurrence._2} words with ${occurrence._1} occurrences"))

    spark.stop()
  }
}