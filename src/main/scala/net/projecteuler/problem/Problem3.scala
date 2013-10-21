package net.projecteuler.problem


object Problem3 extends Problem{
  def findMax(i :Long) = {
    def iter(i :Long ,primes :Stream[Int]) : Int = i match {
      case 1 => primes.head
      case j if j % primes.head == 0 => iter (j / primes.head,primes)
      case j => iter(j,primes.tail)
    }
    iter(i,primes)
  }
  def solve = findMax(600851475143L)
}