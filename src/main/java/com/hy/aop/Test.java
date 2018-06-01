package com.hy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 简单的aop实现
 * <p>
 * 在执行注有AopAnn的方法前，都会先去执行切面里的before方法
 * 在执行注有AopAnn的方法后，都会先去执行切面里的after方法
 *
 * @author wyx
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopConfiguration.class);
        AopService bean = annotationConfigApplicationContext.getBean(AopService.class);
        bean.run(1,1);
    }
}
