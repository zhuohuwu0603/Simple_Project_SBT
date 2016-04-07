

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
http://stackoverflow.com/questions/28362341/error-utils-uncaught-exception-in-thread-sparklistenerbus


	sbt package
	sbt run	

(4) Run from spark-shell using spark-submit

cd /Users/zhuohuawu/Documents/zw_codes/testTools/sbtTest 

/Users/zhuohuawu/Documents/zw_programs/spark/spark-1.6.1-bin-hadoop2.6/bin/spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/scala-2.10/simple-project_2.10-1.0.jar	


2. Build spark from source code
(1) Download Spark source code using git clone:

(2) import into Intellij using via sbt project

(3) build/sbt clean assembly

http://spark.apache.org/docs/latest/building-spark.html#speeding-up-compilation-with-zinc

fast build: build/sbt -Pyarn -Phadoop-2.3 assembly

(4)


3. Spark streaming with Kafka

(1) spark streaming + kafka + storm:
http://www.michael-noll.com/blog/2014/05/27/kafka-storm-integration-example-tutorial/

https://www.digitalocean.com/community/tutorials/how-to-install-apache-kafka-on-ubuntu-14-04

http://www.bogotobogo.com/Hadoop/BigData_hadoop_Zookeeper_Kafka_single_node_Multiple_broker_cluster.php

https://github.com/zhuohuwu0603/kafka-storm-starter

4. Spark with Cassandra: see climate analysis


5. Spark with Elastic Search
