package com.hy.bean.BeanPostProcessor;


import org.springframework.stereotype.Service;

@Service
public class TeatherService {

    @WYX
    private StudentService studentService;

    public void sayHello() {
        studentService.sayHello();

        System.out.println("----------------------------------TeatherService.sayHello");
    }


}
