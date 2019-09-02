package com.hy.designpattern.prototype;

/**
 * 原型模式
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("wyx");

        Student clone = (Student) student.clone();
        System.out.println(clone.getName());
    }
}
