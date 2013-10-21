package net.projecteuler.problem


object Problem10 extends Problem{
  def solve = primes.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)
}