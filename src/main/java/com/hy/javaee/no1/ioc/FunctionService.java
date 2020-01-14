package com.hy.javaee.no1.ioc;

import org.springframework.stereotype.Service;

/**
 * 定义被调用类
 *
 * @author wyx
 */
@Service
public class FunctionService {

    /**
     * 被调用的方法
     */
    public String sayHello(String work) {
        return "exec com.hy.javaee.no1.ioc.FunctionService.sayHello " + work;
    }
}
