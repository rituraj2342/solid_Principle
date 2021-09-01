//there are two seperate classes which have a single functionality and one is not depending on other
import scala.util.control.Breaks.break

class age {
  def Agefactor(): Unit = {
    println("enter the age of person")
    val personAge = scala.io.StdIn.readInt()

    for(_ <- 1 to 60){
      if (personAge < 30){println("Person is Young")
        break()}
      else {println("person is old")
        break()
      }}}}
class drink {
  def permit(): Unit ={
    println("enter the age of person")
    val personAge = scala.io.StdIn.readInt()
    if (personAge < 18){println("he can not drink")
    }
    else {println("he can drink")
    }
  }
}

object Main2{
  def main(args: Array[String]): Unit = {
    val age = new age
    age.Agefactor()

  }
}