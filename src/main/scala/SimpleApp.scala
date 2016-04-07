/* SimpleApp.scala */


//import akka.event.slf4j.Logger
//import akka.event.slf4j.Logger
import org.apache.log4j.{Logger, Level, LogManager, PropertyConfigurator}
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SimpleApp {
 def main(args: Array[String]) {
   //PropertyConfigurator.configure("log4j.properties")
   //val log = Logger.getLogger("org.apache.spark")
   val logger = LogManager.getRootLogger()
   logger.setLevel(Level.ERROR)

   val logFile = "../spark/README.md"
   val conf = new SparkConf().setAppName("Simple Application").setMaster("local[4]")
   val sc = new SparkContext(conf)
   val logData = sc.textFile(logFile, 2).cache()
   val numAs = logData.filter(line => line.contains("a")).count()
   val numBs = logData.filter(line => line.contains("b")).count()
     println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

   print("hello")

   sc.stop()
 }
}
