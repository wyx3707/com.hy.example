package com.hy.proxy.jdk;

/**
 * 目标类实现
 *
 * @author WYX
 */
public class LogService implements IlogService {

    @Override
    public void add() {
        System.out.println("我是目标类上的add");
    }

    @Override
    public void delete() {
        System.out.println("我是目标类上的delete");
    }
}
