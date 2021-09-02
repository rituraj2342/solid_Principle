/*Liskov Substitution Principle*/
trait animals{
  def think:Unit
}
class humans extends animals {
  override def think:Unit={
    println("humans can think")
  }
}
class dog extends animals {
  val dogMind= true
  override def think:Unit={
    if(dogMind==true) println("dogs can also think")
  }
}
object LSP {
  def main(args: Array[String]): Unit = {
    val people = new humans
    people.think
    val dog = new dog
    dog.think
  }
}