package com.hy.spring.importtest.example_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext1 = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        Student bean = annotationConfigApplicationContext1.getBean(Student.class);
        bean.say();
    }
}
