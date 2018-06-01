package com.hy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 定义切面
 *
 * @author wyx
 */
@Component
@Aspect
public class DefinitionAop {

    /**
     * 有AopAnn注解的方法都是切点
     */
    @Pointcut("@annotation(AopAnn)")
    public void execService() {
    }

    /**
     * 在实际方法执行之前执行
     */
    @Before(value = "execService()")
    public void execBefore(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("aop method name is " + name);
        List<Object> objects = Arrays.asList(joinPoint.getArgs());
        System.out.println("aop method args with " + objects);
        System.out.println("我会在实际方法执行之前执行");
    }

    /**
     * 返回通知
     * 在目标方法执行完成后，返回结果可在这个方法是获取
     *
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "execService()", returning = "result")
    public void execAfter(JoinPoint joinPoint, Integer result) {

        System.out.println("method return result is " + result);
        System.out.println("我会在实际方法执行之后执行");
    }
}
