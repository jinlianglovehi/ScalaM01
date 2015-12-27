package com.doudou.cn

import java.util.Date

import kafka.javaapi.consumer.ConsumerConnector

/**
  * Created by jinliang on 15/12/23.
  * scala 和java 之间的可以互相的调用
  */
object TestTime {
  def main(args: Array[String]) {
    val now = new Date();
    println(now.getTime)

  }

}
