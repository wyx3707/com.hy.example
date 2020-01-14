package com.hy.spring.initbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName test
 * @Desc TODO
 * @Author WYX
 * @Date 2018/5/8 12:25
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(InitConfig.class);

    }
}
