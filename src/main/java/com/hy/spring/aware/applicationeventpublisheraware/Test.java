package com.hy.spring.aware.applicationeventpublisheraware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-14 16:10
 **/
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MyApplicationEventPublisherAware bean = annotationConfigApplicationContext.getBean(MyApplicationEventPublisherAware.class);
        bean.send();

    }
}
