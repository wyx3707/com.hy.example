package com.hy.diyannotation;

import org.springframework.stereotype.Component;

@Component
@Type("student")
public class Student extends Man {
    @Override
    void say() {
        System.out.println("Student");
    }
}
