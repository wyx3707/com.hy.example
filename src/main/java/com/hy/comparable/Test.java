package com.hy.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Sort sort = new Sort("aa", 100);
        Sort sort1 = new Sort("bb", 101);
        Sort sort2 = new Sort("cc", 103);
        Sort sort3 = new Sort("dd", 102);
        List<Sort> list= new ArrayList();
        list.add(sort);
        list.add(sort1);
        list.add(sort2);
        list.add(sort3);
        System.out.println(list);
        Object[] objects = list.toArray();
        Arrays.sort(objects);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}
