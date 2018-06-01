package com.hy.java8.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * HashMap 子类中的key都是无序存放，
 * TreeMap 子类中的key是有序存放的
 */
public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, String> all = new TreeMap<String, String>();
        all.put("aaa", "aa");
        all.put("bbb", "bb");
        all.put("ddd", "dd");
        all.put("ccc", "cc");
        Set<Map.Entry<String, String>> set = all.entrySet();
        Iterator<Map.Entry<String, String>> iter = set.iterator();
        while (iter.hasNext()){
            Map.Entry<String, String> me = iter.next();
            System.out.println(me.getKey() + " --> " + me.getValue());
        }
    }
}
