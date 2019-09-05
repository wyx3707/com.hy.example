package com.hy.annotation.example_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        GetList bean = annotationConfigApplicationContext.getBean(GetList.class);
        List<Student> list = bean.getList();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
