package com.hy.spring.initbean.example1;

/**
 * @ClassName InitBean
 * @Desc TODO
 * @Author WYX
 * @Date 2018/5/8 12:24
 * @Version 1.0
 */
public class InitBean {

    /**
     * 定义初始化方法
     */
    public void init() {
        System.out.println("InitBean init");
    }

    /**
     * 定义销毁方法
     */
    public void destroy() {
        System.out.println("InitBean destroy");
    }

    /**
     * 构造方法
     */
    public InitBean() {
        System.out.println("InitBean constructor");
    }
}
