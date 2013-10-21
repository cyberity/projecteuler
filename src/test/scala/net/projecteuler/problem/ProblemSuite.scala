package net.projecteuler.problem

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import scala.collection.SortedMap
import scala.collection.immutable.ListMap

@RunWith(classOf[JUnitRunner])
class ProblemSuite extends FunSuite {
  val answers = ListMap(
    Problem1 -> 233168,
    Problem2 -> 4613732,
    Problem3 -> 6857,
    Problem4 -> 906609,
    Problem5 -> 232792560,
    Problem6 -> 25164150,
    Problem7 -> 104743,
    Problem8 -> 40824,
    Problem9 -> 31875000,
    Problem10 -> 142913828922L,
    Problem11 -> 70600674,
    Problem12 -> 76576500,
    Problem13 -> 5537376230L,
    Problem14 -> 837799,
    Problem15 -> 137846528820L,
    Problem16 -> 1366,
    Problem17 -> 21124,
    Problem18 -> 1074,
    Problem19 -> 171,
    Problem20 -> 648,
    Problem21 -> 31626,
    Problem22 -> 871198282,
    Problem23 -> 4179871,
    Problem24 -> 2783915460L,
    Problem25 -> 4782,
    Problem26 -> 983,
    Problem27 -> -59231,
    Problem28 -> 669171001,
    Problem29 -> 9183,
    Problem30 -> 443839,
    Problem31 -> 73682,
    Problem32 -> 45228,
    Problem33 -> 100,
    Problem34 -> 40730,
    Problem35 -> 55,
    Problem36 -> 872187,
    Problem37 -> 748317,
    Problem38 -> 932718654,
    Problem39 -> 840,
    Problem40 -> 210,
    Problem41 -> 7652413,
    Problem42 -> 162,
    Problem43 -> 16695334890L,
    Problem44 -> 5482660,
    Problem45 -> 1533776805,
    Problem46 -> 5777,
    Problem47 -> 134043,
    Problem48 -> 9110846700L,
    Problem49 -> 296962999629L,
    Problem50 -> 997651,
    Problem51 -> 121313,
    Problem52 -> 142857,
    //    Problem53 -> 6857,
    //    Problem54 -> 906609,
    //    Problem55 -> 232792560,
    Problem56 -> 972,
    //    Problem57 -> 104743,
    //    Problem58 -> 40824,
    //    Problem59 -> 31875000,
    //    Problem60 -> 142913828922L
    //    Problem66 -> 972,
    Problem67 -> 7273);
//    for ((problem, answer) <- answers) {
//      test("problem " + problem) {
//        assert(problem.solve == answer)
//      }
//    }
  answers drop (50) take (10) foreach {
    case (problem, answer) =>
      test("problem " + problem) {
        assert(problem.solve == answer)
      }
  };
}
