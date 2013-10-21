package net.projecteuler.problem

object Problem49 extends Problem {
  def solve = {
    primes.dropWhile(_ < 1000).takeWhile(_ < 10000).toList.groupBy(i => i.toString.sorted).
    values.flatMap(_.toSet.subsets(3).map(_.toList.sorted)).filter(l => l(0)+l(2) == 2*l(1)).
    filter(_(0) != 1478).head.mkString("").toLong
  }
}