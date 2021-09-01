//By extending the bike class, we can be sure that our existing application won't be affected.

class bike{
  def model(mod:String): Unit ={

    println("model number is "+mod)
  }
  def accessories(num:Int): Unit ={
    println("number of accessories are "+num)
  }
}
class modify extends bike{
  def purchase(year:Int): Unit ={
    println("year is "+year)
  }
}
object Main{
  def main(args: Array[String]): Unit = {
    val obj = new modify
    obj.model("Splender")
    obj.accessories(2)
    obj.purchase(2020)
  }
}