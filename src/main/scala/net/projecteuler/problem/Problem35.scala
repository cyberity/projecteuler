package net.projecteuler.problem

object Problem35 extends Problem{
  def rotations(i : Int) = {
    val is = i.toString
    is.indices map (i =>(is.drop(i)+is.take(i)).toInt)
  }
  def solve = {
    val ps = (primes takeWhile(_ < 1000000)).toSet
    ps.filter(i => rotations(i).forall(n => ps.contains(n))).size
  }
}