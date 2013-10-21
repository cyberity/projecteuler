package net.projecteuler.problem

import scala.io.Source

object Problem22 extends Problem {
  lazy val names = loadFile("names.txt").getLines.mkString.split(",").map(_.init.tail)
  def charToOrder(c : Char) = c - 'A' + 1
  def solve = names.sorted.zipWithIndex.map { case (name, i) => name.map(charToOrder).sum * (i + 1) }.sum
}