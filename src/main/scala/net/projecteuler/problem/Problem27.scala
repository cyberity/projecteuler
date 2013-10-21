package net.projecteuler.problem


object Problem27 extends Problem{
  def formula(a:Int,b:Int,n : Int) = n*n + a*n + b
  def solve = {
    val fs = for {
      a <- -999 to 999
      b <- -999 to 999
      n = Stream.from(0).dropWhile(n=>isPrime(formula(a,b,n))).head
      if n > 1
    } yield (a,b,n)

    val m = fs.maxBy(_._3)
    m._1 * m._2
  }
}