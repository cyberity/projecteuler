package net.projecteuler.problem


object Problem1 extends Problem {
  def solve = 1 until 1000 filter (i => i % 3 == 0|| i % 5 == 0) sum
}