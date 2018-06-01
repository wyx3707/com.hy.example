package com.hy.java8.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 如果增加元素是一对的话，则就可用使用Map接口完成
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> all = new HashMap<String, String>();
        all.put("aaa", "aa");
        all.put("bbb", "bb");
        all.put("ddd", "dd");
        all.put("ccc", "cc");
        Set<Map.Entry<String, String>> entries = all.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
    }
}
