package com.hy.javaee.no1.aop;

import org.springframework.stereotype.Service;

/**
 * 定义在切面编程中的注解切点的测试类
 *
 * @author wyx
 */
@Service
public class DemoAnnotationService {

    /**
     * 在方法上标注自定义的特性
     */
    @AspectAnnotation(name = "com.hy.javaee.no1.aop.DemoAnnotationService.add")
    public void add() {
        System.out.println("exec com.hy.javaee.no1.aop.DemoAnnotationService.add");
    }
}
