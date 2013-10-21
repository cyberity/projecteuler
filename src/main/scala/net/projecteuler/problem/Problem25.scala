package net.projecteuler.problem


object Problem25 extends Problem {
  def solve = fibs.takeWhile(_.toString.length < 1000).size + 1
}