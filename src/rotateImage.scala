import scala.collection.mutable

object rotateImage:
  def main(args: Array[String]) =
    val matrix1 = mutable.ArrayBuffer(mutable.ArrayBuffer(1))
    rotate(matrix1)
    println(s"Expected: ArrayBuffer(ArrayBuffer(1)), Actual: $matrix1")
    val matrix2 = mutable.ArrayBuffer(mutable.ArrayBuffer(1, 2), mutable.ArrayBuffer(3, 4))
    rotate(matrix2)
    println(s"Expected: ArrayBuffer(ArrayBuffer(3, 1), ArrayBuffer(4, 2)), Actual: $matrix2")
    val matrix3 = mutable.ArrayBuffer(
      mutable.ArrayBuffer(1, 2, 3),
      mutable.ArrayBuffer(4, 5, 6),
      mutable.ArrayBuffer(7, 8, 9),
    )
    rotate(matrix3)
    println(s"Expected: ArrayBuffer(ArrayBuffer(7, 4, 1), ArrayBuffer(8, 5, 2), ArrayBuffer(9, 6, 3)), Actual: $matrix3")


def rotate(matrix: mutable.ArrayBuffer[mutable.ArrayBuffer[Int]]): Unit =
  reflectAcrossYEqualsX(matrix)
  reflectHorizontally(matrix)

def reflectAcrossYEqualsX(matrix: mutable.ArrayBuffer[mutable.ArrayBuffer[Int]]): Unit =
  val n = matrix.length
  for i <- 0 until n do
    for j <- i + 1 until n do
      val tmp = matrix(i)(j)
      matrix(i)(j) = matrix(j)(i)
      matrix(j)(i) = tmp

def reflectHorizontally(matrix: mutable.ArrayBuffer[mutable.ArrayBuffer[Int]]): Unit =
  val n = matrix.length
  for i <- 0 until n do
    for j <- 0 until n/2 do
      val tmp = matrix(i)(j)
      matrix(i)(j) = matrix(i)(n-1-j)
      matrix(i)(n-1-j) = tmp
