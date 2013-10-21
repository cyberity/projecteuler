package net.projecteuler.problem


object Problem14 extends Problem{

  def collatz(n : Long) :Int = {
    def iter(n : Long,acc : Int = 0) :Int = 
      if (n == 1) acc + 1
      else iter(if(n % 2 == 0) n/2 else 3*n+1,acc + 1)
    iter(n,0)
  }

  def solve = (1 until 1000000).map(i => (i,collatz(i))).maxBy(_._2)._1

}