package com.hy.bean.BeanPostProcessor;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @WYX
    private TeatherService teatherService;

    public void sayHello() {
        teatherService.sayHello();
        System.out.println("---------------------------StudentService.sayHello");
    }

}
