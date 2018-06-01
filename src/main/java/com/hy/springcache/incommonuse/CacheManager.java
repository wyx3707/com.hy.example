package com.hy.springcache.incommonuse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存管理器定义
 *
 * @param <T>
 * @author wyx
 */
public class CacheManager<T> {

    private Map<String, T> cache = new ConcurrentHashMap<>();

    public T getValue(String key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        return null;
    }

    public void addCache(String key, T t) {
        cache.put(key, t);
    }
}
