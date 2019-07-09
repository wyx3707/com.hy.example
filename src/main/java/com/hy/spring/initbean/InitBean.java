package com.hy.spring.initbean;

/**
 * @ClassName InitBean
 * @Desc TODO
 * @Author WYX
 * @Date 2018/5/8 12:24
 * @Version 1.0
 */
public class InitBean {

    public void init() {
        System.out.println("InitBean init");
    }

    public void destroy() {
        System.out.println("InitBean destroy");
    }

    public InitBean() {
        System.out.println("constr InitBean");
    }
}
