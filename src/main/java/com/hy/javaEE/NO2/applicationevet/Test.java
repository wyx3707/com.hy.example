package com.hy.javaEE.NO2.applicationevet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        DemoPulish bean = annotationConfigApplicationContext.getBean(DemoPulish.class);
        bean.publish();
    }
}
