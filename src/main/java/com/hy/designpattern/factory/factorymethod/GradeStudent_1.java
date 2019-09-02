package com.hy.designpattern.factory.factorymethod;

public class GradeStudent_1 implements Factory {
    @Override
    public Student createStudent() {
        return new Student(1);
    }
}
