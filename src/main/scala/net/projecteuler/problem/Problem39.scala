package net.projecteuler.problem

object Problem39 extends Problem{
  def solve = {
    val max = 1000
    val abcs = for {
      c <- 1 until max
      b <- 1 until c
      a <- 1 until b
      if (a+b+c <= max && a*a+b*b == c*c)
    } yield a+b+c
    abcs.groupBy(i=>i).maxBy(_._2.size)._1
  }
}