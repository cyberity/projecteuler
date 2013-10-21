package net.projecteuler.problem


object Problem66 extends Problem{
  def judge(x:Int,y:Int,D:Int) = x*x-D*y*y == 1
  def isSquare(x:Int) = {
    val sqrt = Math.sqrt(x).toInt
    sqrt*sqrt == x
  }
  def findX(D:Int) = {
    natures.find(x => (1 to x).exists(y=>judge(x,y,D))).get
  }
  def solve = {
    val xs = 
      for {
        D <- 1 to 40
        if (!isSquare(D))
      }
      yield findX(D)
    xs.max
  }
}