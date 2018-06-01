package com.hy.java8.collection.stack;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ddd");
        stack.push("ccc");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
