package com.hy.designpattern.requestchain;

public class Test {
    public static void main(String[] args) {
        BjCity bjCity = new BjCity(null);
        ShCity shCity = new ShCity(bjCity);
        shCity.elect(120);
    }
}
