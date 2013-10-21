package net.projecteuler.problem

object Problem19 extends Problem {
  def solve = {
    val lengths = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val allMonths = for {
      year <- 1900 to 2000
      month <- 1 to 12
    } yield lengths(month - 1) + (if (month == 2 && year % 4 == 0 && year % 100 != 0) 1 else 0)
    allMonths.scanLeft(1)((s, m) => (s + m) % 7).init.drop(12).count(_ == 0)
  }
}