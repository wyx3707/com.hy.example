package com.hy.spring.importtest.example_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportImportBeanDefinitionRegistrarConfiguration.class);
        Student student_3 = (Student) annotationConfigApplicationContext.getBean("student_3");
        student_3.say();
    }
}
