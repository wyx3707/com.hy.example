package com.hy.autowried;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-01-15 18:57
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(AutowriedConfiguration.class);
    }
}
