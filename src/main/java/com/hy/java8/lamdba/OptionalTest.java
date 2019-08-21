package com.hy.java8.lamdba;

import lombok.Data;

import java.util.Optional;

/**
 * 对optional 做测试
 *
 * @author wyx
 */
public class OptionalTest {

    public static void main(String[] args) {
        Student student = null;
        Optional<Student> optional = Optional.ofNullable(student);

        //如果存在则执行
        //optional.ifPresent(System.out::println);

        //如果存在则返回,没有则返回其他的实例
//        Student student11=new Student();
//        student11.setName("abc");
//        Student student1 = optional.orElse(student11);
//        System.out.println(student1.getName());

        //如果存在则返回，没有则去调用一个方法生成
//        Student student3 = optional.orElseGet(() -> {
//            Student student2 = new Student();
//            student2.setName("123");
//            return student2;
//        });
//        System.out.println(student3.getName());

        String s = optional.map(i -> i.getName()).map(i->i.toUpperCase()).orElse("adsf");
        System.out.println(s);

    }

}

@Data
class Student {

    private String name;
}
