package com.hy.designpattern.strategy;

/**
 * 具体的操作实现
 *
 * @program: demo
 * @description: 上海鸭子
 * @author: wyx
 * @create: 2019-12-17 14:32
 **/
public class ShDuck extends AbstractDuck {
    @Override
    void run() {
        System.out.println("我是上海的鸭子,咕咕咕。。。");
    }
}
