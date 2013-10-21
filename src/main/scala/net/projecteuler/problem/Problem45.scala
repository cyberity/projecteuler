package net.projecteuler.problem

object Problem45 extends Problem {
  lazy val triangle = natures map (n => n * (n + 1L) / 2) buffered
  lazy val pentagonal = natures map (n => n * (3 * n - 1L) / 2) buffered
  lazy val hexagonal = natures map (n => n * (2 * n - 1L)) buffered
  lazy val its = List(triangle.drop(285).buffered, pentagonal, hexagonal)
  def findEqual : Long = {
    val heads = its.map(_.head)
    val max = heads.max
    if (heads.forall(_ == max))
      max
    else {
      its.foreach(it => while (it.head < max) it.next)
      findEqual
    }
  }
  def solve = findEqual
}