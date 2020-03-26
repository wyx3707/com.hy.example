package com.hy.lock.redis_lock;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-26 15:07
 **/
@Component
public class Client {

    @Resource
    private RedisTemplate redisTemplate;

    public boolean exec(String key) {
        Boolean aBoolean = redisTemplate.getConnectionFactory().getClusterConnection().setNX(key.getBytes(), new byte[]{});
        return aBoolean;
    }
}
