package net.projecteuler.problem


object Problem29 extends Problem{
  def solve = {
    val nums = for {
      i <- 2 to 100
      j <- 2 to 100
    } yield BigInt(i).pow(j)
    nums.toSet.size
  }
}