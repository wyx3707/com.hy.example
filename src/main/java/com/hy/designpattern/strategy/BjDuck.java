package com.hy.designpattern.strategy;

/**
 * 具体的操作实现
 *
 * @author wyx
 */
class BjDuck extends AbstractDuck {

    @Override
    void run() {
        System.out.println("我是北京的鸭子，嘎嘎嘎。。。。");
    }
}
