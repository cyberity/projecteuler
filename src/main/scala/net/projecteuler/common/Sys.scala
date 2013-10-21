package net.projecteuler.common

import scala.io.Source

trait Sys {
  def loadFile(name : String) = Source.fromURL(getClass.getResource("/" + name))
}