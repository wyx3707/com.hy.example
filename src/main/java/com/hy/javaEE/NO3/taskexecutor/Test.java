package com.hy.javaEE.NO3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        //UserTaskExecutor bean = annotationConfigApplicationContext.getBean(UserTaskExecutor.class);
        AsyncTaskExecutor bean = annotationConfigApplicationContext.getBean(AsyncTaskExecutor.class);
        for (int i = 0; i < 10; i++) {
            bean.execAsyncTask(i);
            bean.execAsyncTask1(i);
        }
    }
}
