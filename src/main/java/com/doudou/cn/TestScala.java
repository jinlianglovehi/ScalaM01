package com.doudou.cn;

import akka.actor.Actor;
import akka.actor.ActorSystem;
import akka.actor.UntypedActor;

/**
 * Created by jinliang on 15/12/23.
 *  java与scala 之间的交互
 *
 */
public class TestScala {
    public static void main(String[] args) {
        ScalaFun fun = new ScalaFun();
        fun.sayHello("你好");
        /**
         * akka 的管理系统
         */
        ActorSystem  actorSystem ;
    }
}
