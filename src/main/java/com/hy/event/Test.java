package com.hy.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wyx on 2017/8/1.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(EventConfiguration.class);
        System.out.println("开始发布事件");
        annotationConfigApplicationContext.publishEvent(new MyEvent(annotationConfigApplicationContext, "土豆土豆这是面瓜"));
        //发布的事件必须完成后，主线程再继续执行
        System.out.println("结束发布事件");
    }
}
