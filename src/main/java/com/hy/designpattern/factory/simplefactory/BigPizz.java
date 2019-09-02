package com.hy.designpattern.factory.simplefactory;

public class BigPizz extends Pizz {
    /**
     * 制作披萨第一步
     */
    @Override
    public    void step1() {
        System.out.println("大披萨第一步");
    }

    /**
     * 制作披萨第二步
     */
    public  @Override
    void step2() {
        System.out.println("大披萨第二步");
    }

    /**
     * 制作披萨第三步
     */
    @Override
    public void step3() {
        System.out.println("大披萨第三步");
    }
}
