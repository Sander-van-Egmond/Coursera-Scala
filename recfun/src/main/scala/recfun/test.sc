def pascal(c: Int, r: Int): Int = {
  if (c==0||r==0 || r==c) 1
  else pascal(c-1,r-1) + pascal(c,r-1)
}

pascal(0,2)
pascal(1,2)
pascal(1,3)
pascal(2,4)

def balance(chars: List[Char]): Boolean = {
  def loop(chars: List[Char], openings: Int): Boolean = {
    if (chars.isEmpty) openings == 0
    else if (chars.head == ')')
      if (openings == 0) false
      else loop(chars.tail, openings-1)
    else if (chars.head == '(') loop(chars.tail, openings+1)
    else loop(chars.tail, openings)
  }

  loop(chars, 0)
}

balance("(if (zero? x) max (/ 1 x))".toList)
balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
balance(":-)".toList)
balance("())(".toList)
balance("(((hello)there)you)(".toList)

def countChange(money: Int, coins: List[Int]): Int = {
  if (money < 0 || coins.isEmpty) 0
  else if (money == 0) 1
  else countChange(money, coins.tail) + countChange(money-coins.head, coins)
}

countChange(4,List(1,2))