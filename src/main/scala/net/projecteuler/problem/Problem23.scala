package net.projecteuler.problem


object Problem23 extends Problem {
  def isAbundant(i : Int) = factors(i).sum - i > i
  def solve = {
    val abuns = 1 to 28123 filter isAbundant
    val exc = abuns.view.flatMap { a =>
      abuns.takeWhile(_ <= (28123 - a)).map(a +)
    }
    (1 to 28123 diff exc).sum
//    val flags = Array.range(0, 28123)
//    for (i <- abuns; j <- abuns if i + j < 28123)
//      flags(i + j) = 0
//        flags.sum
  }
}