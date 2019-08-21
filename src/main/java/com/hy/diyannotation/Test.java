package com.hy.diyannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        HandlerConext hc = (HandlerConext) annotationConfigApplicationContext.getBean("hc");
        hc.getInstance("student").say();
        hc.getInstance("teacher").say();
        hc.getInstance("teasscher").say();
    }
}
