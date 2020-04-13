package com.hy.spring.importtest.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试
 *
 * @author wyx
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportImportBeanDefinitionRegistrarConfiguration.class);
        Student student3 = (Student) annotationConfigApplicationContext.getBean("student3");
        student3.say();
    }
}
