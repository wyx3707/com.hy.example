package com.hy.javaee.no1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 1： 使用@PointCut定义一个切点
 * 2：直接使得拦截规则用为参数
 */
@Aspect
@Component
public class LogAspect {

    /**
     * 方式一：
     */
    @Pointcut("@annotation(com.hy.javaee.no1.aop.AspectAnnotation)")
    public void annot() {
    }

    @After("annot()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AspectAnnotation annotation = method.getAnnotation(AspectAnnotation.class);
        System.out.println("注解式拦截" + annotation.name());
    }


    /**
     * 方式二
     *
     * @param joinPoint
     */
    @Before("execution(* com.hy.javaee.no1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截" + method.getName());

    }

}
