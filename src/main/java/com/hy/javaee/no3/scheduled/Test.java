package com.hy.javaee.no3.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScheduledConfiguration.class);
        UserScheduled bean = annotationConfigApplicationContext.getBean(UserScheduled.class);
        bean.exec();
    }
}
