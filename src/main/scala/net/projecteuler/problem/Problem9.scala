package net.projecteuler.problem


object Problem9 extends Problem {
  def solve = {
    val s = for{
      c <- Stream.range(1,1000)
      a <- Stream.range(1,c)
      b = 1000-a-c
      if a*a+b*b == c*c
    } yield a*b*c
    s.head
  }
}