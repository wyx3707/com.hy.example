package com.hy.javaee.no1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 这个例子中，实现了两种方式
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AspectConfiguration.class);
        DemoAnnotationService bean = annotationConfigApplicationContext.getBean(DemoAnnotationService.class);
        DemoMethodService bean1 = annotationConfigApplicationContext.getBean(DemoMethodService.class);
        bean1.add();


    }
}
