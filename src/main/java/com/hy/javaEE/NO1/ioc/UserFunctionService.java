package com.hy.javaEE.NO1.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionService {
    @Autowired
    private FunctionService functionService;

    public String sayHello(String work) {
        return functionService.sayHello(work);
    }

}
