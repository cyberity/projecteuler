package net.projecteuler.problem

object Problem38 extends Problem{
  def isPandigital(s:String) = s.sorted == "123456789"
  def solve = (1 to 9999).flatMap(i=>(1 to 9).map(_*i).scanLeft("")(_+_).tail).filter(isPandigital).max.toLong
}