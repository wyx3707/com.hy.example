package com.hy.springcache.spring_cach_example;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(cacheNames = "user")
    public User getUserById(String id){
        System.out.println("现在查询数据库");
        return new User("msz");
    }
}
