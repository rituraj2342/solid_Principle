/*
trait myTrait{
  def square(side1:Int, side2:Int): Int = side1 * side2
  def rectangle(side1:Int, side2:Int): Int = side1 * side2
}
*/

//larger interfaces split into smaller ones. By doing so, we can ensure
//that implementing classes only need to be concerned about the methods
//that are of interest to them.
trait myTrait1{
  def square(side1:Int, side2:Int): Int = side1 * side2
}
trait myTrait2{
  def rectangle(side1:Int, side2:Int): Int = side1 * side2
}
class shape1 extends myTrait1 {
  override def square(side1: Int, side2: Int): Int = side1 * side2
}
class shape2 extends myTrait2{
  override def rectangle(side1:Int, side2:Int): Int = side1 * side2
}
object Main1{
  def main(args: Array[String]): Unit = {
    val obj = new shape1
    println(obj.square(4,4))
  }
}