package com.hy.spring.importtest.example_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ImportSelectorConfiguration.class);
        Student bean = annotationConfigApplicationContext.getBean(Student.class);
        bean.say();

        Theach bean1 = annotationConfigApplicationContext.getBean(Theach.class);
        bean1.say();
    }
}
