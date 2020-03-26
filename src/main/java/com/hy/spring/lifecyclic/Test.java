package com.hy.spring.lifecyclic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-20 09:10
 **/
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CycliConfiguration.class);
        Bean bean = annotationConfigApplicationContext.getBean(Bean.class);
        System.out.println(bean.getName());
    }

}
