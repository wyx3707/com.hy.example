package com.hy.bean.initanddestroy;

/**
 * 定义一个普通的类
 *
 * @author WYX
 */
public class InitService {

    public InitService() {
        System.out.println("创建这个类");
    }

    public void init() {
        //在创建这个类后所做的一个初始化的操作可在这里写
        System.out.println("初始化这个类");
    }

    public void destroy() {
        //可以在这里做一个销毁之前的操作
        System.out.println("销毁这个类");
    }
}
