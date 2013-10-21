package net.projecteuler.problem

object Problem41 extends Problem {
  def solve = {
    "7654321".permutations.map(_.toInt).find(i=>isPrime2(i)).get
  }
}