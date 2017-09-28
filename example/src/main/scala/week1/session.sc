1+3
def abs(x: Double) = if (x < 0) -x else x
abs(2)
abs(-2)



def sqrt(x: Double) = {
  sqrtIter(1.0)

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) < x / 100

  def improve(guess: Double) =
    (guess + x / guess) / 2
}
sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)
