package com.hy.spring.aware.applicationcontextaware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-14 15:28
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        MyApplicationContextAware bean = annotationConfigApplicationContext.getBean(MyApplicationContextAware.class);
        bean.invok();
    }
}
