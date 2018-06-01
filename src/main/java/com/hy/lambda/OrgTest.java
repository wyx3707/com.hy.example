package com.hy.lambda;

import lombok.Data;

import java.util.function.Consumer;

/**
 * Consumer 消费函数式接口:
 * 意思是对参数进行赋值，或其他操作，没有返回值
 *
 * @author wyx
 */
public class OrgTest {

    //示例1
    static Consumer<Student> consumer = (s) -> {
        s.setAge(100);
        s.setName("wyx");
    };

    //示例2
    static Consumer<Student> consumer1 = (s) -> {
        print(s);
    };

    private static void print(Student student) {
        //这里可以操作student对象
        System.out.println("我的年龄：" + student.getAge());
        System.out.println("我的名字:" + student.getName());
    }

    public static void main(String[] args) {
//        1示例
//        Student student = new Student();
//        consumer.accept(student);
//        System.out.println(student.getAge());
//        System.out.println(student.getName());


        //2示例 做一些其他操作的例子
        Student student = new Student();
        student.setAge(100);
        student.setName("wyx");
        consumer1.accept(student);
    }
}

@Data
class Student {
    private String name;
    private int age;
}
