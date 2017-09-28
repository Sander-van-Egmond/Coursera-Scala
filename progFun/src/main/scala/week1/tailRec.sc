def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)

gcd(14,21)


def factorial(n: Int): Int =
  factorialAdd(n , 1)
  def factorialAdd(n: Int, add: Int): Int ={
    if (n==0) add else factorialAdd(n-1, add * n)
  }

factorial(4)
factorial(3)
factorial(2)
factorial(1)
factorial(0)


4*(3*(2*(1*1)))