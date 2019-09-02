package com.hy.designpattern.factory.factorymethod;

import lombok.Data;

@Data
public class Student {
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }
}
