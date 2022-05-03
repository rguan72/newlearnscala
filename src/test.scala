import collection.mutable.Stack

object Test:
  def main(args: Array[String]) =
    println("Hello, world!")
    val x = new Stack[Int]
    val y = methodBro[Int]
    println(y)

  def methodBro[A] =
    Nil