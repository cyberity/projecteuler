package net.projecteuler.problem


object Problem4 extends Problem{
  def isPalindromic(i : Int) = i.toString == i.toString.reverse
  def solve = {
    val muls = for (i <- 1 until 1000;j <- i until 1000) yield i * j
    muls sortWith(_ > _) filter isPalindromic head
  }
}