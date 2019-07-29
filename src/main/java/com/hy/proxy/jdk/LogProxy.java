package com.hy.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 *
 * @author WYX
 */
public class LogProxy {

    private IlogService logService;

    public LogProxy(IlogService logService) {
        this.logService = logService;
    }

    public IlogService getLogService() {
        ClassLoader classLoader = logService.getClass().getClassLoader();
        Class[] interfaces = new Class[]{IlogService.class};
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我是扩展的信息");
                return method.invoke(logService, args);
            }
        };
        IlogService proxyInstance = (IlogService) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return proxyInstance;
    }
}
