package net.projecteuler.problem


object Problem12 extends Problem {
  lazy val n = natures
  def solve = Iterator.iterate(n.next)(_+n.next).find(s =>factors(s).size >= 500).get
}