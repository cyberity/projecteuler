package net.projecteuler.problem


object Problem20 extends Problem {
  def solve = (100!).toString.map(_.asDigit).sum
}