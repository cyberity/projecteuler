package net.projecteuler.problem


object Problem52 extends Problem{
  lazy val prime = primes.take(10).toArray
  def hash(x :Int) = x.toString.map(c => prime(c.asDigit)).product
  def judge(x :Int) = hash(x) == hash(2*x) && hash(x) == hash(3*x) && hash(x) == hash(4*x) && hash(x) == hash(5*x) && hash(x) == hash(6*x)
  def solve = {
    natures.find(judge).get
  }
}