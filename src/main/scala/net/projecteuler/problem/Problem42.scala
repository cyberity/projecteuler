package net.projecteuler.problem

object Problem42 extends Problem {
  lazy val triangles = Stream.from(1).map(n =>n*(n+1)/2)
  def isTriangle(i :Int) = triangles.dropWhile(_ < i).head == i
  def solve = loadFile("words.txt").getLines.next.tail.init.split("\",\"").map(word=>word.map(_-'A'+1).sum).count(isTriangle)
}