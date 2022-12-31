package com.grace.bigdata.application.algoristhm

object PatternMatchDemo extends App{

  val number = 9
  val res1 = number match {
    case 0 => "zero"
    case 5 => "five"
    case 9 => "nine"
    case _=> "too earlier"

  }
  printf("match result : " + res1 + "\n")

  printf("new line " + res1)
}
