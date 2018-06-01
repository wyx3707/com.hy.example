package com.hy.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 官方的函数式接口应用
 *
 * @author wyx
 */
public class OrgTest {
    public static void main(String[] args) {
        /**
         *
         */
        Consumer<String> com = (x) -> System.out.println(x);
        com.accept("s");

    }
}
