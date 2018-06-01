package com.hy.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 动态代理类实现方式
 *
 * @author wyx
 */
public class DemoInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //这里可以做一些附加的操作，比如日志，等
        System.out.println("method begin");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("method end");
        return result;
    }
}
