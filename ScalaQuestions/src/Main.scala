import org.apache.spark
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession

import scala.::

class Main{



  var list1: List[Int] = List(1,2,3,1)

  //print(list1.map(a=>(a,1)).reduce((a,b)=>if(a._1.contains(b._1)) (a._1,a._2+b._2) else (a._1+" "+ b._1,a._2+b._2)))
  print(list1.map(a=>(a,1)).reduce((a,b)=>if(a._1.toString.contains(b._1.toString)) (a._1,a._2+b._2) else ((a._1.toString+b._1.toString).toInt,a._2+b._2)))
}
object Main {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder().master("local[1]").appName("Main1").getOrCreate()

    //val data1=Seq("Arr","Arr1","Arr2")
    //val rdd=spark.sparkContext.parallelize(data1)
    var max1: String = " "
    val input=spark.sparkContext.textFile("C:\\Users\\apoudal\\Desktop\\SampleTextDataset.txt")
    //val list1 = input.flatMap(f=>f.split(" ")).map(m=>(m,1)).reduce((a,b)=>if(a._2<=b._2) ((b._1,b._2)) else (a._1,a._2))
      //.reduce((a,b)=>if(a._2<=b._2) (b._1,b._2) else (a._1,a._2))


      //rdd2.saveAsTextFile("C:\\Users\\apoudal\\new1")

    /*
    val columns = Seq("language","Users")
    val data = Seq(("Java", "20000"), ("Python", "100000"), ("Scala", "3000"))
    val rdd1 = spark.sparkContext.parallelize(data)
    val dfFromRDD2 = spark.createDataFrame(rdd1).toDF(columns: _*)
    dfFromRDD2.printSchema()

     */
    //val o=new Main();
    //println(o.list)
}}
