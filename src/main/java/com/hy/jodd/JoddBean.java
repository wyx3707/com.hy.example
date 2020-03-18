package com.hy.jodd;

import jodd.bean.BeanUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 这个类是测试使用jodd-bean jar的工具
 *
 * @author wyx
 */
public class JoddBean {
    public static void main(String[] args) {

//        String url = "https://siwechatapp.ecej.com/lot?deviceNo=\"0010000004\"&deviceType=\"001\"&unitType=\"0001\"";
//        List<String> deviceType = getSubUtil(url, "deviceType=\"(\\d*)\"");
//        List<String> unitType = getSubUtil(url, "unitType=\"(\\d*)\"");
//
//        System.out.println(deviceType.get(0));
//        System.out.println(unitType.get(0));


        List<Case> caseList = new ArrayList<>();


        Case ca = new Case();

        caseList.add(ca);
        ca.setName("劳而无功");
        System.out.println(caseList.get(0).getName());
        //String name = BeanUtil.pojo.getProperty(ca, "name").toString();
       // System.out.println(name);

//        Class<?> name1 = BeanUtil.declared.getPropertyType(ca, "age");
//        Class<?> name2 = BeanUtil.declared.getPropertyType(ca, "name");
//        System.out.println(name1.getClass());
//        System.out.println(name2.getClass());

    }


    private static List<String> getSubUtil(String soap, String rgex) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(rgex);
        Matcher m = pattern.matcher(soap);
        while (m.find()) {
            int i = 1;
            list.add(m.group(i));
        }
        return list;
    }


    @Data
    static class Case {

        private String name;
        private Integer age;
    }
}
