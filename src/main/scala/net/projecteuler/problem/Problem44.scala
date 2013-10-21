package net.projecteuler.problem

object Problem44 extends Problem{
  lazy val pentagonals = Stream.from(1).map(n=>n*(3*n-1)/2).take(10000).toArray
  lazy val sets = pentagonals.toSet
  def isPentagonal(i:Int) = sets.contains(i)
  def solve = {
    val pairs = for {
      i <- 1 until 10000
      j <- 1 to i-1
      if (isPentagonal(pentagonals(i)-pentagonals(j))&&isPentagonal(pentagonals(i)+pentagonals(j)))
    } yield pentagonals(i)-pentagonals(j)
    pairs.min
  }
}