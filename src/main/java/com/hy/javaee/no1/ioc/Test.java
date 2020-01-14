package com.hy.javaee.no1.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用AnnotationConfigApplicationContext 作为Spring容器，接受输入一个配置类作为参数
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(IocConfiguration.class);
        UserFunctionService bean = annotationConfigApplicationContext.getBean(UserFunctionService.class);
        String str = bean.sayHello("china");
        System.out.println(str);
    }
}
