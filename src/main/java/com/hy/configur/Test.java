package com.hy.configur;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(PropertiesConfiguration.class);
        ReadPropertyValue readPropertyValue = (ReadPropertyValue)annotationConfigApplicationContext.getBean("read");
        String name = readPropertyValue.getName();
        System.out.println(name);
        annotationConfigApplicationContext.start();
        //在这里如果使用while(true) 使主线程一直在跑，则服务会一直启动着
        //while(true){

      //  }


    }
}
