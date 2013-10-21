package net.projecteuler.problem

object Problem50 extends Problem {
  lazy val max = 1000000
  def solve = {
    val ps = primes.takeWhile(_ < max).scanLeft(0L)(_+_).toArray
    var mwidth = 0
    var result = 0L
    for {
      i <- 1 until ps.size
      j <- i-mwidth to 0 by -1
      if (ps(i)-ps(j) < max && isPrime2((ps(i)-ps(j)).toInt))
    }{
      mwidth = i-j
      result = ps(i)-ps(j)  
    }
    result
  }
}