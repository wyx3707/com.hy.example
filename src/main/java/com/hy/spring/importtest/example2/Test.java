package com.hy.spring.importtest.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试
 *
 * @author wyx
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ImportSelectorConfiguration.class);
        Student student = annotationConfigApplicationContext.getBean(Student.class);
        student.say();
        Teacher teacher = annotationConfigApplicationContext.getBean(Teacher.class);
        teacher.say();
    }
}
