package com.hy.springcache.spring_cach_example;

import java.io.Serializable;

public class User implements Serializable {

    public User(String name) {
        this.name = name;
    }

    public String name;

    public String getName() {
        return this.name;
    }
}
