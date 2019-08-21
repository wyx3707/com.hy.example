package com.hy.diyannotation;

import java.util.Map;

public class HandlerConext {

    private Map<String, Class> map;

    public HandlerConext(Map<String, Class> map) {
        this.map = map;
    }

    public Man getInstance(String s) {
        Class put = map.get(s);
        try {
            return (Man) put.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
