package com.hy.springboot.importtest.example_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ImportConfigration.class);
        Student bean = annotationConfigApplicationContext.getBean(Student.class);
        bean.say();

    }
}
