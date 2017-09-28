package week2

class Rational(x: Int, y: Int){
  require(y != 0, "denominator must be non-zero")

  def this(x: Int) = this(x, 1)
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer: Int = x
  def denom: Int = y

  def < (that: Rational): Boolean = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational): Rational = if (this < that) that else this

  def + (that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def unary_- : Rational = new Rational(-numer,denom)

  def - (that: Rational): Rational = this + -that

  override def toString: String = {
    val g = gcd(numer, denom)
    numer/g +"/"+ denom/g
  }
}