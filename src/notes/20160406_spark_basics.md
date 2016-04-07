

20160406. Review Spark basics

1. Spark screencast: http://spark.apache.org/screencasts/
(1) download spark-hadoop from spark, modify SPARK_HOME/conf add log4j.property, spark-env.sh

(2) build spark source code: 
	sbt package

(3) create simple sbt project manually: http://spark.apache.org/docs/latest/quick-start.html

	create a SimpeApp.scala, simple.sbt, put SimpeApp.scala into src/main/scala

	setMaster from program: 
	val conf = new SparkConf().setAppName("Simple Application").setMaster("local[4]")

	sc.stop //add at the end

	sbt package
	sbt run	

(4) Run from spark-shell using spark-submit

cd /Users/zhuohuawu/Documents/zw_codes/testTools/sbtTest 

/Users/zhuohuawu/Documents/zw_programs/spark/spark-1.6.1-bin-hadoop2.6/bin/spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/scala-2.10/simple-project_2.10-1.0.jar	



