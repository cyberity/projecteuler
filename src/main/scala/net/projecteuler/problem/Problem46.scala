package net.projecteuler.problem

object Problem46 extends Problem{
  def solve = {
    val l = for {
      i <- 1 to 1000
      p <- primes.take(1000)
    } yield  p + 2 * i * i
    val s = l.toSet
    Stream.from(5,2).filter(i => !s.contains(i) && !isPrime(i)).head
  }
}