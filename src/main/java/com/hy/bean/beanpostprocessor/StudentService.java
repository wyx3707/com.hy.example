package com.hy.bean.beanpostprocessor;

import org.springframework.stereotype.Service;

@Service(value = "studentService1")
public class StudentService {

    @WYX
    private TeatherService teatherService;

    public void sayHello() {
        teatherService.sayHello();
        System.out.println("---------------------------StudentService.sayHello");
    }

}
