package net.projecteuler.problem

object Problem32 extends Problem{
  def solve = {
    val products = for {
      a <- 2 to 10000
      b <- 2 to 10000/a
      p = a*b
      if ((a.toString+b.toString+p.toString).sorted == "123456789")
    } yield p
    products.toSet.sum
  }
}