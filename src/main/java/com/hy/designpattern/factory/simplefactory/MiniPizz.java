package com.hy.designpattern.factory.simplefactory;

public class MiniPizz extends Pizz {
    /**
     * 制作披萨第一步
     */
    @Override
  public   void step1() {
        System.out.println("小披萨第一步");
    }

    /**
     * 制作披萨第二步
     */
    @Override
    public   void step2() {
        System.out.println("小披萨第一步");
    }

    /**
     * 制作披萨第三步小
     */
    @Override
    public void step3() {
        System.out.println("小披萨第一步");
    }
}
