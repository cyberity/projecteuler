package net.projecteuler.problem

import net.projecteuler.common.Arith
import net.projecteuler.common.Sys

abstract class Problem extends App with Arith with Sys{

  def solve : Long
  
  val starttime = System.currentTimeMillis
  println("result: "+solve)
  println("time used:"+ (System.currentTimeMillis-starttime).toFloat/1000 + "s" )
}