package com.hy.bean.BeanPostProcessor;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);

    }
}
