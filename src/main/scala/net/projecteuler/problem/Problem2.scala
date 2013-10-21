package net.projecteuler.problem


object Problem2 extends Problem{
  def solve = (fibs takeWhile (_ < 4000000) filter (_ % 2 == 0) sum).toLong
}