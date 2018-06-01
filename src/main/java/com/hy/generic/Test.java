package com.hy.generic;


import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的入门
 * 1、泛型：标签，泛化类型
 * 2、作用：安全，放心
 */
public class Test {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("ele");
        //不需要强转，不需要考虑类型
        String s = stringArrayList.get(0);
        System.out.println(s);

        //jdk1.4之前
        List list = new ArrayList();
        list.add(1);
        list.add("ele");
        //取出来的都是object 相要具体的类型需要强转
        Object object = list.get(0);
        Integer o1 = (Integer) object;
        //出错 不安全
        String str = (String) object;


        GengericInterfaceImpl gengericInterface=new GengericInterfaceImpl();
        String type = gengericInterface.getType();


    }


}
