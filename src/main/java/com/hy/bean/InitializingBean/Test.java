package com.hy.bean.InitializingBean;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(InitializingBeanConfiguration.class);
        Student bean = annotationConfigApplicationContext.getBean(Student.class);
        String name = bean.getName();
        System.out.println(name);
    }
}
