package net.projecteuler.problem

object Problem48 extends Problem {
  lazy val length = 10
  lazy val big = BigInt(10).pow(length).toLong 
  def solve = {
    (1 to 1000 map {i => BigInt(i).modPow(i, big).toLong} sum) % big
  }
}