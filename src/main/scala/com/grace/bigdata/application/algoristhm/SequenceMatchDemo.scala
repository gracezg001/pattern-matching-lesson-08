package com.grace.bigdata.application.algoristhm

class SequenceMatchDemo {

  def demo(): Unit = {
    val numbers = List(10, 20, 30)

    val r = numbers match {
      case List(a, b, c) => c

      case  _ => -1
    }

    println(r)
  }

}

object SequenceMatchDemo{
  def run(): Unit = {
    new SequenceMatchDemo().demo()
  }
}