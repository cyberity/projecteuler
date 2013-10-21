package net.projecteuler.problem


object Problem15 extends Problem {
  lazy val cache = scala.collection.mutable.Map[Pair[Int, Int], Long]()
  def routes(i : Int, j : Int) : Long = {
    if (cache.contains((i, j))) {
      cache((i, j))
    } else {
      val r = if (i == 1 && j == 1)
        2
      else if (i == 1 || j == 1)
        i + j
      else
        routes(i - 1, j) + routes(i, j - 1)
      cache((i, j)) = r
      r
    }
  }
  def solve = routes(20, 20)  
}