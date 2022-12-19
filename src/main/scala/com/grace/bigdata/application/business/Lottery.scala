package com.grace.bigdata.application.business

import scala.util.Random


object Lottery extends App{
  case class Trip(to: String)
  case class Car(model: String)
  case class Cash(amount: Int)
  case class NoPrize()

  val magicBucket =List(NoPrize(), Car("Tesla"), Trip("New Zealand"), Cash(1000), Cash(500), NoPrize(), NoPrize(),NoPrize(),NoPrize(
  ))

  Random.shuffle(magicBucket).take(1)(0)match {
    case t: Trip => println(s"You have won a trip to ${t.to}")
    case c: Car  => println(s"You have won a ${c.model}")
    case ca: Cash => println(s"You have won a ${ca.amount} dollars")
    case n: NoPrize => println(s"Hard luck, you did not win anything. Try again")
  }

}
