object Printargs {
  def main(args: Array[String]) = {
    val args = List("yo", "lo", "bro")
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }

    var j = 0
    while (j < args.length) {
      if (j != 0)
        print(" ")
      print(args(j))
      j += 1
    }
    println()

    args.foreach(arg => println(arg))
    args.foreach(println)
    for (arg <- args)
      println(arg)
  }
}