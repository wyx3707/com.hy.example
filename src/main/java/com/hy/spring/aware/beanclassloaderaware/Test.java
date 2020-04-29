package com.hy.spring.aware.beanclassloaderaware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-15 08:24
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        MyBeanClassLoaderAware bean = annotationConfigApplicationContext.getBean(MyBeanClassLoaderAware.class);
        bean.aVoid();
    }
}
