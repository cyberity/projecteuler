package net.projecteuler.problem


object Problem17 extends Problem{
  lazy val words = Map(1->"one",2->"two",3->"three",4->"four",5->"five",6->"six",7->"seven",8->"eight",9->"nine",10->"ten",
      11->"eleven",12->"twelve",13->"thirteen",14->"fourteen",15->"fifteen",16->"sixteen",17->"seventeen",18->"eighteen",
      19->"nineteen",20->"twenty",30->"thirty",40->"forty",50->"fifty",60->"sixty",70->"seventy",80->"eighty",90->"ninety",
      1000->"onethousand",-100->"hundred")
  def counter(i : Int) : Int = 
    if (i == 0)
      0
    else if(words.contains(i))
      words(i).length
    else if (i >= 100)
      counter(i / 100) + counter(-100) +(if (i % 100 == 0) 0 else 3 + counter(i % 100)) 
    else 
      counter(i-i%10) + counter(i % 10)
        
  def solve = 1 to 1000 map counter sum
}