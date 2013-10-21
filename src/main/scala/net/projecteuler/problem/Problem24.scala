package net.projecteuler.problem


object Problem24 extends Problem{
  def solve = "0123456789".permutations.drop(999999).next.toLong
}