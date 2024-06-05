
import scala.collection.mutable
import scala.util.control.Breaks.{break, breakable}


object Lists{
    def main(args:Array[String]): Unit ={
    val list: List[Int] = List(1, 2, 3)
    val list2: List[Int] = List(1, 4, 3)
     breakable{
    if (list.length == list2.length) {
      for (i <- list.indices) {
        if (list(i) != list2(i)) {
          print("Not Equal")
          break
        }
      }
    }
     }

      var map:mutable.HashMap[Int,Int]=mutable.HashMap[Int,Int]()
      for(i<-list){
        if(map.contains(i)){
          map(i)=map(i)+1
        }
        else{
          map.put(i,1)
        }
      }
      var map1: mutable.HashMap[Int, Int] = mutable.HashMap[Int, Int]()
      for (i <- list2) {
        if (map1.contains(i)) {
          map1(i) = map1(i) + 1
        }
        else {
          map1.put(i, 1)
        }
      }
      var flag: Boolean = true
      if(map.keySet==map1.keySet) {
        map.keySet.foreach(f => {
          if (map1.contains(f)) {
            if (!(map(f) == map1(f))) {
              flag = false

            }
          }
        })
        if (flag) {
          print("Equal")
        }
        else {
          print("Not Equal")
        }
      }
      else{
        println("Not Equal")
      }
    }
}
