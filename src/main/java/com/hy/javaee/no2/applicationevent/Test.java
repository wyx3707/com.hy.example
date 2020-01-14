package com.hy.javaee.no2.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(EventConfiguration.class);
        DemoPublish bean = annotationConfigApplicationContext.getBean(DemoPublish.class);
        bean.publish();
        System.out.println("end");
    }
}
