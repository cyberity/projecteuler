package net.projecteuler.problem

object Problem31 extends Problem{
  def ways(amount: Int,units:List[Int]) : Int = 
    if (units == Nil || units.head > amount) 0
    else if(units.head == amount) 1
    else ways(amount-units.head,units) + ways(amount,units.tail)
  
  def solve = ways(200,List(1,2,5,10,20,50,100,200))
}