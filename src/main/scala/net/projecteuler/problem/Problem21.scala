package net.projecteuler.problem


object Problem21 extends Problem{
  def d(i :Int) = factors(i).sum - i
  def solve = 1 until 10000 filter (i => d(i) != i && d(d(i)) == i) sum
}