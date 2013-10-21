package net.projecteuler.problem

object Problem47 extends Problem{
  def solve = {
    natures.map(i => decompose(i).size == 4).sliding(4).zipWithIndex.filter(x => x._1.forall(b => b)).next()._2+1
  }
}