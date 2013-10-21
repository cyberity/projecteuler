package net.projecteuler.problem


object Problem30 extends Problem{
  def pow(i : Int,p : Int = 5) = Math.pow(i,p).toInt
  def ceil = natures.dropWhile(n => pow(10,n) < n * pow(9)).next
  def solve = 2 to pow(10,ceil) filter (i => i.toString.map(c=>pow(c.asDigit)).sum == i) sum
}