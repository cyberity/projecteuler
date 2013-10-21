package net.projecteuler.problem

object Problem36 extends Problem {
  def palindromic(s : String) = s.reverse == s
  def solve = 1 until 1000000 filter (i=>palindromic(i.toString) && palindromic(i.toBinaryString)) sum
}