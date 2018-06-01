package com.hy.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestList {

    public static void main(String[] args) {
        /**
         * 第一种是ArrayList
         * ArrayList 是允许重复的数据的加入的，并是有序的
         */
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(null);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //结果；a a b c


        List<String> vector=new Vector<>();
        vector.add("a");
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add(null);
        Iterator<String> iterator1 = vector.iterator();
        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }
    }
}
