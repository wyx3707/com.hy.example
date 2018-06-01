package com.hy.java8.collection.list;

import java.util.List;
import java.util.Vector;

/**
 * Vector 子类实际上是最早的数据 结构的实现为在， 也称为向量
 *
 * @author wyx
 */
public class TestVector {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

    }
}
