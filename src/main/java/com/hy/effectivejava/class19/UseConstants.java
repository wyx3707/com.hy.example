package com.hy.effectivejava.class19;

/**
 * 这种方式是静态导入机制，这样写后下面的类中直接可用常量值
 */

import static com.hy.effectivejava.class19.Constants.*;

/**
 * 使用常量类
 *
 * @author wyx
 */
public class UseConstants {

    public static void main(String[] args) {
        System.out.println(MIN_VALUE);
    }
}
