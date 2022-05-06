import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException

object Ch7 extends App {
  val stuff = Array("scala", "is", "fun")
  val filename =
    if (!stuff.isEmpty) stuff(0)
    else "default.txt"
  println(if (!stuff.isEmpty) stuff(0) else "default.txt")
  for (i <- 1 until 4)
    println(s"Iteration ${i}")
  for (i <- 1 until 10 if i % 2 == 0)
    println(s"Iteration ${i}")
  val n = 10
  val half =
    if (n % 2 == 0)
      n / 2
    else
      throw new RuntimeException("n must be even")
  try {
    val f = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException => println("not found!")
    case ex: IOException => println("io issue!")
  }
  def f(): Int = try return 1 finally return 2
  def g(): Int = try 1 finally 2
  println(f())
  println(g())
  val firstArg = "chips"
  val friend =
    firstArg match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
    }
  println(friend)
//  val file = new FileReader("input.txt")
//  try {
//    println("yo!")
//  } finally {
//    file.close()
//  }
}

def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

def makeRow(row: Int) = makeRowSeq(row).mkString

def mutilTable() = {
  val tableSeq =
    for (row <- 1 to 10)
      yield makeRow(row)
  tableSeq.mkString("\n")
}

def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }

//def scalaFiles =
//  for {
//    file <- filesHere
//    if file.getName.endsWith(".scala")
//  } yield file

//def grep(pattern: String) =
//  for {
//    file <- filesHere
//    if file.getName.endsWith(".scala")
//    line <- fileLines(file)
//    trimmed = line.trim
//    if trimmed.matches(pattern)
//  } println(s"$file: $trimmed")

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)