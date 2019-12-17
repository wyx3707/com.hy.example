package com.hy.designpattern.strategy;

/**
 * 策略模式
 */
public class Test {
    public static void main(String[] args) {
      DuckSak duckSak=new DuckSak();
      duckSak.setAbstractDuck(new ShDuck());
      duckSak.say();
    }
}
