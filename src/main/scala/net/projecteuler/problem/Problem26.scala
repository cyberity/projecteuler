package net.projecteuler.problem


object Problem26 extends Problem{
  def simplify(i : Int) : Int= 
    if (i % 2 == 0)
      simplify(i/2)
    else if (i % 5 == 0)
      simplify(i/5)
    else 
      i
  def len(i : Int) = natures.find(BigInt(10).modPow(_, i) == 1).get
    
  def solve = (1 until 1000).map(simplify).filter(_ > 1).maxBy(len)
}