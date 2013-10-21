package net.projecteuler.problem


object Problem56 extends Problem{
  def sum(a : Int,b:Int) = BigInt(a).pow(b).toString.map(_.asDigit).sum
  def solve = {
    val sums = 
      for {a <- 1 until 100
           b <- 1 until 100}
        yield sum(a,b)
    sums.max
  }
}