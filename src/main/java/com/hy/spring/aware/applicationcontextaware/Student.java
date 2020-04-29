package com.hy.spring.aware.applicationcontextaware;

import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-14 15:26
 **/
@Service
public class Student {

    public void say(){
        System.out.println("com.hy.spring.aware.applicationcontextaware.Student.say");
    }
}
