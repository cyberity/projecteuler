package net.projecteuler.problem

object Problem34 extends Problem{
  def solve = 3 to 100000 filter (i => i.toString.map(_.asDigit!).sum == i) sum
}