package net.projecteuler.problem


object Problem28 extends Problem{
  def solve = {
    Range(1,1001,2).foldLeft(1)((sum,i) => sum + (i*i + i + 1)+ (i*i + 2*(i + 1)) + (i*i + 3*(i + 1))+ (i*i + 4*(i + 1)))
  }
}