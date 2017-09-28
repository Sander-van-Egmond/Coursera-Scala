def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a+1, f(a)+acc)
  }
  loop(a, 0)
}

sum(a => a)(2,6)
sum(a => a*a)(3,5)