object Main {
  def main(args:Array[String]){ 
    var a = scala.io.StdIn.readInt()
    for(i <- a to a + 11 by 2){
      if(i % 2 != 0){
      println(i)
      }
      else{
        println(i + 1)
      }
    }
  }
}
