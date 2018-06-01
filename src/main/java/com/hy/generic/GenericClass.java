package com.hy.generic;

/**
 * 自定义泛型类
 * 1 < >
 * T Type  类型
 * K V Key ,Value  键、 值
 * E Element  元素
 *
 * @author wyx
 */
public class GenericClass<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        GenericClass<Integer> lo=new GenericClass<>();
        GenericClass<String> lo1=new GenericClass<>();
        lo.setT(60);
        lo1.setT("adsf");


    }
}
