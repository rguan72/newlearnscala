import java.math.BigInteger
import scala.collection.mutable

object Ch3 {
  def main(args: Array[String]) = {
    val big = new BigInteger("12345")
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"
    for (i <- 0 to 2)
      print(greetStrings(i))
    val numNumes = Array("one", "two", "three")
    numNumes.foreach(println)
    val oneTwoThree = List(1, 2, 3)
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(0 :: oneTwoThree)
    println(1 :: 2 :: 3 :: Nil)
    println(Nil)
    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)
    val (num, ballons) = pair
    println(s"$num $ballons")

    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)

    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground")
    treasureMap += (3 -> "Dig")
    println(treasureMap(2))

    // 1 -> 2 returns a two element tuple!!
    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III"
    )
    println(romanNumeral(2))

    def formatStuff(stuff: Array[String]) = stuff.mkString("\n")
    println(formatStuff(Array("one", "two", "three")))
  }
}