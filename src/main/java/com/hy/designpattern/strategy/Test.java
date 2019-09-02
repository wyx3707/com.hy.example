package com.hy.designpattern.strategy;

/**
 * 策略模式
 */
public class Test {
    public static void main(String[] args) {
        ITea bjTea = new BjTea();
        ITea shTea = new ShTea();
        IRun bjRun=new BjRun();
        BjDuck bjDuck = new BjDuck();
        bjDuck.setItea(bjTea);
        bjDuck.tea();
        bjDuck.setItea(shTea);
        bjDuck.setIrun(bjRun);
        bjDuck.tea();
        bjDuck.run();
    }
}
