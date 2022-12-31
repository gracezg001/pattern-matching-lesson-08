package com.grace.bigdata.application.algoristhm

object BookDemo extends App{
  case class Book(title: String, yearPublished: Integer, author: String, ishn: String)

  val progInScala = Book("Pramming in Scala 3rd Edition", 2016, "Martin Odersky","0981531687")
  val funInScala = Book("Functional Programming in Scala", 2014, "Paul Chiusano","16172990653")
  val scalaCook = Book("Scala Cookbok", 2013, "Alexander", "14493396611")

  progInScala match {
    case Book(title, yearPublished, author, ishn) => println(s"$title <=> $yearPublished <=> $author <=> $ishn")
    case _=> println("Did not match anything")
  }

  val authorName = scalaCook match {
    case Book(_, _, author, _) => author
    // case _=> println("No author found")

  }
  println("==>" + authorName)

  funInScala match {
    case Book(title, _, author,_) => println(s"$title <=> $author")
    case _=> println("No book found")
  }

}
