package com.hy.lock.redis_lock;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-26 14:41
 **/

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(RedisLockConfiguration.class);
        RedisTemplate bean = annotationConfigApplicationContext.getBean(RedisTemplate.class);
        Object name = bean.opsForValue().get("name");
        System.out.println(name);
    }
}
