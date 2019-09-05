package com.hy.annotation.example_2;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GetList {

    @GetListAnn
    public List<Student> getList() {
        return Arrays.asList(new Student(1), new Student(2), new Student(3), new Student(4));
    }
}
