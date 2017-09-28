def product(f: Int => Int)(a: Int, b: Int): Int ={
  if (a>b) 1
  else f(a) * product(f)(a+1,b)
}

product(a => a*a)(3,4)


def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a+1, f(a)+acc)
  }
  loop(a, 0)
}

sum(a => a)(2,6)
sum(a => a*a)(3,5)

def sum2(f: Int => Int)(a: Int, b: Int): Int = {
  if (a > b) 0
  else f(a) + sum2(f)(a+1,b)
}

sum2(a => a)(2,6)
sum2(a => a*a)(3,5)


def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1,b))
}

def product2(f: Int => Int)(a: Int, b: Int): Int =
  mapReduce(f, (x, y) => x*y, 1)(a, b)

product2(a => a*a)(3,4)

def sum3(f: Int => Int)(a: Int, b: Int): Int =
  mapReduce(f, (x,y )=> x+y, 0)(a,b)

sum3(a=>a)(2,6)