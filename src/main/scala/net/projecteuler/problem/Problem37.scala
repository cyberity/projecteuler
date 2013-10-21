package net.projecteuler.problem

object Problem37 extends Problem{
  def part(i : Int) = {
    val s = i.toString
    1 until s.length flatMap (i => List(s.take(i).toInt,s.drop(i).toInt))
  }
  def solve = primes.dropWhile(_ < 8).filter(p => part(p).forall(isPrime _)).take(11).sum
}