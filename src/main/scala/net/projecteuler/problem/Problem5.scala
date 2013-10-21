package net.projecteuler.problem


object Problem5 extends Problem{
  def solve = (20 to Int.MaxValue).find(i => 11 to 20 forall (i % _ == 0)).get
}