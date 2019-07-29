package com.hy.bean.initanddestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by WYX on 2017/8/1.
 * 一个bean的初始化和销毁方法
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(InitConfiguration.class);
        annotationConfigApplicationContext.getBean(InitService.class);
    }
}
