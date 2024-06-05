import org.apache.spark.sql.SparkSession


object Words {
  def main(args: Array[String]){
  val spark=SparkSession.builder().master("local[1]").appName("Words").getOrCreate()

  var input=spark.sparkContext.textFile("C:\\Users\\apoudal\\Desktop\\SampleTextDataset.txt")
  val list2=input.flatMap(f=>f.split(" ")).map(m=>(m,1)).reduceByKey(_+_)
  val list1=input.flatMap(f=>f.split(" ")).map(m=>(m,1)).reduceByKey(_+_).reduce((a,b)=>if(a._2>b._2) a else b)

  for(i<-list2)
  {
    if(i._2==list1._2){
      println("The Word :"+i._1+" Frequency: "+i._2)
    }
  }


  }}
