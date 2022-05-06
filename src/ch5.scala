
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs,  d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = {
    this(n, 1)
    println("henlo")
  }
  override def toString = s"$numer/$denom"
  def + (that: Rational): Rational =
    Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  def + (i: Int): Rational =
    Rational(numer + i * denom, denom)
  def - (that: Rational): Rational =
    Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): Rational =
    Rational(numer - i * denom, denom)
  def * (that: Rational): Rational =
    Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational =
    Rational(numer * i, denom)
  def / (that: Rational): Rational =
    Rational(numer * that.denom, denom * that.numer)
  def / (i: Int) =
    Rational(numer, denom * i)
  def lessThan(that: Rational): Boolean =
    this.numer * that.denom < that.numer * this.denom
  def max(that: Rational): Rational =
    if (lessThan(that)) that else this
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

object Ch5 extends App {
  val x = Rational(5, 7)
  println(x.numer)
  println(x + Rational(2, 8))
  val y = Rational(6)
  println(Rational(66, 42))
  //  println(2 * y)
  implicit def intToRational(x: Int): Rational = Rational(x)
  println(2 * y)
}