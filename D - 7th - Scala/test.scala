import org.apache.log4j.{Level,Logger}
import org.apche.spark.sql.{Column,SparkSession}    


val sp = SparkSession.builder().appName("WebLog").master("local[*]").getOrCreate()
val base_df 