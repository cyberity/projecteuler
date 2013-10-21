package net.projecteuler.problem

object Problem33 extends Problem {
  def gcd(x:Int,y:Int) : Int = if(y==0) x else gcd(y,x % y)
  def solve = {
    //ij/kl
    val fs = for {
      i <- 1 to 9
      j <- 1 to 9
      k <- 1 to 9
      l <- 1 to 9
      if ((i != j && 10*i+j<10*k+l) && ((i == l && (10*i+j)*k == (10*k+l)*j) || (j == k && ((10*i+j)*l == (10*k+l)*i))))
    } yield (10*i+j,10*k+l)
    val p = fs.reduceLeft((i,j) => (i._1*j._1,i._2*j._2))
    p._2/gcd(p._1,p._2)
  }
}