package net.projecteuler.problem

object Problem51 extends Problem {
  def solve = {
    val solution = for {
      p <- primes
      ps = p.toString
      positions <- (0 until ps.length).toSet.subsets.filter(subs =>subs.size > 1 && subs.map(i=>ps(i)).size == 1)
      family = ('0' to '9').map(d => positions.foldLeft(ps)((s,p)=>s.updated(p,d))).filter(_.head != '0').map(_.toInt)
      if (family.filter(isPrime2).size == 8)
    } yield p
    solution.head
  }
}