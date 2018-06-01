package com.hy.generic;

public class GengericInterfaceImpl1<T> implements GengericInterface<String> {
    @Override
    public String getType() {
        return null;
    }

    public void print(T t){

    }

    public static void main(String[] args) {
        GengericInterfaceImpl1<String> o=new GengericInterfaceImpl1<String>();
        o.print("");

    }
}
