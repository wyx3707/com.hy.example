package com.hy.bean.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by WYX on 2017/8/1.
 */
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
        PrototypeService p1 = annotationConfigApplicationContext.getBean(PrototypeService.class);
        PrototypeService p2 = annotationConfigApplicationContext.getBean(PrototypeService.class);

        SingletonSerivce s1 = annotationConfigApplicationContext.getBean(SingletonSerivce.class);
        SingletonSerivce s2 = annotationConfigApplicationContext.getBean(SingletonSerivce.class);
        System.out.println(p1.equals(p2));
        System.out.println(s1.equals(s2));
        annotationConfigApplicationContext.close();

    }
}
