package com.hy.java算法.二分法;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-18 10:02
 **/
public class Test {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        exec(ints, 2);
    }

    public static void exec(int[] arr, int a) {
        int length = arr.length;
        int mix = 0;
        int middle;
        int max = length - 1;
        while (mix <= max) {
            System.out.println("看看执行了几点");
            middle = (max + mix) / 2;
            System.out.println(middle);
            if (arr[middle] == a) {
                System.out.println("找到了");
                return;
            } else if (arr[middle] < a) {
                mix = middle;
            } else {
                max = middle;
            }
        }
    }
}
