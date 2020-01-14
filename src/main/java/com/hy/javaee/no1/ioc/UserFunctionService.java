package com.hy.javaee.no1.ioc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 定义一个调用类
 *
 * @author wyx
 */
@Service
public class UserFunctionService {

    /**
     * 自动引用FunctionService的bean
     */
    @Resource
    private FunctionService functionService;

    /**
     * @param work
     * @return
     */
    public String sayHello(String work) {
        return functionService.sayHello(work);
    }

}
