package com.hy.wait_and_notify;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-16 08:21
 **/
public class Test {
    public static void main(String[] args) {
        String lock = "abc";
        Product product = new Product(lock);
        Client client = new Client(lock);
        product.start();
        client.start();
    }
}
