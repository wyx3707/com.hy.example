package com.hy.designpattern.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    PizzFactory pizzFactory;
    public Client(PizzFactory pizzFactory) {
        this.pizzFactory = pizzFactory;
    }
    public void run() {
        do {
            String size = getSize();
            System.out.println("size=" + size);
            Pizz pizz = this.pizzFactory.getPizz(size);
            if (null != pizz) {
                pizz.step1();
                pizz.step2();
                pizz.step3();
            } else {
                System.out.println("null");
            }

        } while (true);
    }

    private String getSize() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }


}
