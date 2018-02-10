package com.mycompany.app;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        SparkConf conf = new SparkConf().setAppName("firstSparkProject").setMaster("local[*]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        String path = "helloworld.txt";
 
        System.out.println("Trying to open: " + path);
 
        JavaRDD<String> lines = sc.textFile(path.toString());
        System.out.println("Lines count: " + lines.count());
        sc.stop();
    }
}
