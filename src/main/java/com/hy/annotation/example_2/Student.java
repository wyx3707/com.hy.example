package com.hy.annotation.example_2;

import lombok.Data;

@Data
public class Student {

    public Student(Integer id) {
        this.id = id;
    }

    private Integer id;
    @SetValue(classz = StudentService.class, methodName = "find", getValue = "id", setValue = "name")
    private String name;

}
