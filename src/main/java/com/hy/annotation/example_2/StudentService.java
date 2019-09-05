package com.hy.annotation.example_2;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {


    private Map<Integer, String> map = new HashMap<>();

    @PostConstruct
    public void setStock() {
        map.put(1, "q");
        map.put(2, "w");
        map.put(3, "e");
        map.put(4, "r");
        map.put(5, "t");

    }

    public String find(Integer id) {
        return map.get(id);
    }
}
