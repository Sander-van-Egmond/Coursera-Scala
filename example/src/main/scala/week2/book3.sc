import java.math.BigInteger

val big = new BigInteger("12345")

val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for (i <- 0 to 2)
  print(greetStrings(i))

1.+(2)

val numNames = Array("zero", "one", "two")

numNames(1) = "foo"

numNames

// Using lists

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour


val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree

// Using tuples

val pair = (99, "Luftballons")
pair._1
pair._2

// Using sets and maps

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
jetSet
jetSet.contains("Cessna")

import scala.collection.mutable.Set

val movieSet = Set("Hitch", "Poltergeist")
movieSet += "Shrek"

import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
treasureMap(2)
