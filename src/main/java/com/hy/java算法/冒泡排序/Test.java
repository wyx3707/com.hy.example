package com.hy.java算法.冒泡排序;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-18 10:48
 **/
public class Test {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 1, 3, 6, 8, 5, 4, 10, 2, 11, 7,};
        System.out.println(ints.length);
        paixu(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    static void paixu(int[] ints) {


        for (int i = 0; i < ints.length; i++) {
            System.out.println(i);
            if (i >= ints.length - 1) {
                return;
            }
            System.out.println(ints[i] > ints[i + 1]);
            System.out.println("begin" + ints[i]);
            if (ints[i] > ints[i + 1]) {
                int temp = ints[i];
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
            System.out.println("end" + ints[i]);
        }

    }
}
