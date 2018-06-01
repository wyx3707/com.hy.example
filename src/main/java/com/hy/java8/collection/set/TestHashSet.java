package com.hy.java8.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        //这将不会加入进去
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        //上面的输出可能会是 aaa ccc ddd,因为HashSet中的内容是没有顺序的，属于散列存放的
    }
}
