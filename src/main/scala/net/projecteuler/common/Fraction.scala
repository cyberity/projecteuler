package net.projecteuler.common

class Fraction(x: Int,y : Int) {
  require(y != 0)
  private val g = gcd(x.abs,y.abs)
  val n = x / g
  val d = y / g
  def this(x:Int) = this(x,1)
  def +(that : Fraction) = new Fraction(n*that.d+d*that.n,d*that.d)
  def -(that : Fraction) = new Fraction(n*that.d-d*that.n,d*that.d)
  def *(that : Fraction) = (n*that.n,d*that.d)
  def /(that : Fraction) = (n*that.d,d*that.n)
  private def gcd(x : Int,y : Int) : Int= if (x == 0) y else gcd(y,x % y)

}