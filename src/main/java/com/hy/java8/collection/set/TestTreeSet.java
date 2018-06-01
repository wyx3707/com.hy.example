package com.hy.java8.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 排序存放的子类：TreeSet
 * 会将内容做排序
 *
 * @author wyx
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        //输出一定是 aaa bbb ccc

    }
}
