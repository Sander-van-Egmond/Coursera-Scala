def product(f: Int => Int)(a: Int, b: Int): Int ={
  if (a>b) 1
  else f(a) * product(f)(a+1,b)
}

product(a => a*a)(3,4)

def factorial(a: Int): Int ={
  if (a==0) 1
  else a * factorial(a-1)
}

product(factorial)(3,4)

def fact(n: Int) = product(x => x)(1,n)

fact(5)
product(fact)(3,4)