package com.hy.diyannotation;

import org.springframework.stereotype.Component;

@Component
@Type("teacher")
public class Teacher extends Man {
    @Override
    void say() {
        System.out.println("Teacher");
    }
}
