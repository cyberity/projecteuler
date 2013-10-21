package net.projecteuler.common

import scala.math.BigInt

trait Arith {
  def natures = Iterator.from(1)
  val primes : Stream[Int] = 2 #:: Stream.from(3, 2).filter(n => primes takeWhile (p => p * p <= n) forall (n % _ > 0))
  def longFrom(start : Long, step : Int) : Stream[Long] = start #:: longFrom(start + step, step)
  val longPrimes : Stream[Long] = 2L #:: longFrom(3, 2).filter(n => primes takeWhile (p => p * p <= n) forall (n % _ > 0))
  def isPrime(i : Int) : Boolean = primes.dropWhile(i > _).head == i
  def isPrime2(i : Int) : Boolean = i > 1 && primes.takeWhile(_ < Math.sqrt(i) + 1).forall(i % _ != 0)
  val fibs: Stream[BigInt] = BigInt(1) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }
  def factors(i : Int) = (1 to Math.sqrt(i).toInt).foldLeft(Set[Int]())((s, j) => if (i % j == 0) s + j + (i / j) else s)
  def decompose(i : Int) : Set[Int] = {
    def iter(i : Int, ps : Stream[Int], rs : Set[Int]) : Set[Int] =
      if (i <= 1)
        rs
      else {
        var newps = primes.dropWhile(i % _ != 0)
        iter(i / newps.head, newps, rs + newps.head)
      }
    iter(i, primes, Set.empty[Int])
  }
  implicit def factim(n : Int) = new { def ! = (1 to n).foldLeft(BigInt(1))(_ * _) }
}