package com.hy.spring.importtest.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-13 14:24
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        Student bean = annotationConfigApplicationContext.getBean(Student.class);
        bean.say();
    }

}
