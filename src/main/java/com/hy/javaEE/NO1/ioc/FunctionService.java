package com.hy.javaEE.NO1.ioc;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String work) {
        return "hello" + work;
    }
}
