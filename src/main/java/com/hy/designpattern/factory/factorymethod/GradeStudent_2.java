package com.hy.designpattern.factory.factorymethod;

public class GradeStudent_2 implements Factory {
    @Override
    public Student createStudent() {
        return new Student(2);
    }
}
