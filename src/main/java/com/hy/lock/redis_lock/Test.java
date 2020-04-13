package com.hy.lock.redis_lock;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-26 14:41
 **/

public class Test {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(RedisLockConfiguration.class);
//        RedisTemplate bean = annotationConfigApplicationContext.getBean(RedisTemplate.class);
//        Object name = bean.opsForValue().get("name");
//        System.out.println(name);

        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.size());
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next==4) {
                iterator.remove();
            }
        }
        System.out.println(list.size());
    }
}
