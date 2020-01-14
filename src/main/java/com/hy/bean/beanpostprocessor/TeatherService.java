package com.hy.bean.beanpostprocessor;


import org.springframework.stereotype.Service;

@Service
public class TeatherService {

    @WYX
    private StudentService studentService1;

    public void sayHello() {
        studentService1.sayHello();

        System.out.println("----------------------------------TeatherService.sayHello");
    }


}
