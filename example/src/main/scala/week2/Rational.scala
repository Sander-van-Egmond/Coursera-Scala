package week2

class Rational(x: Int, y: Int){
  def numer: Int = x
  def denom: Int = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg = new Rational(-numer,denom)

  def sub(that: Rational) = add(that.neg)

  override def toString: String = numer + "/" + denom
}