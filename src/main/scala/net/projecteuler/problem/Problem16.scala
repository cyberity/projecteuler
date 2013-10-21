package net.projecteuler.problem


object Problem16 extends Problem{
  def solve = BigInt(2).pow(1000).toString.map(_.asDigit).sum
}