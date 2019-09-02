package com.hy.designpattern.requestchain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        BjCity bjCity = new BjCity(null);
        ShCity shCity = new ShCity(bjCity);
        shCity.elect(120);
    }
}
