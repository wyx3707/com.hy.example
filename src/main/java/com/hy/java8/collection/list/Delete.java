package com.hy.java8.collection.list;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Delete {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student(1), new Student(0), new Student(2), new Student(1), new Student(0), new Student(2));
        for (Student s : studentList) {
            System.out.println(s.getAge());
        }

        studentList.stream().forEach((i) -> {
            if (i.getAge() == 0) {
                i.setAge(-1);
            }
        });
        List<Student> collect = studentList.stream().sorted((s1, s2) -> s1.getAge().compareTo(s2.getAge())).collect(Collectors.toList());
        for (Student s : collect) {
            System.out.println(s.getAge());
        }
    }


}

class Student {
    private Integer age;

    public Student(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
