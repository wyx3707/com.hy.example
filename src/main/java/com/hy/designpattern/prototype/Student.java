package com.hy.designpattern.prototype;

import lombok.Data;

@Data
public class Student implements Cloneable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
