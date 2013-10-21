package net.projecteuler.problem


object Problem6 extends Problem{
  def square(i : Int) = i * i
  def sumOfSquare(i : Int) = 1 to i map square sum
  def squareOfSum(i : Int) = square(1 to i sum)
  def solve = squareOfSum(100)-sumOfSquare(100)
}