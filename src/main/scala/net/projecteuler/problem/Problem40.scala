package net.projecteuler.problem

object Problem40 extends Problem {
  def solve = {
    val s = Stream.from(0).take(200000).mkString("");
    Seq(1,10,100,1000,10000,100000,1000000).foldLeft(1)((m,i) =>m*s(i).asDigit)
 }
}