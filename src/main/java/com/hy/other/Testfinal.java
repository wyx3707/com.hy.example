package com.hy.other;

/**
 * 使用final 修饰变量，保证在以后的使用中不能被改变
 *
 * @author wyx
 * 下面的例子就说明了这个，
 * 使用spring.format ，是生成了一个新的字符串
 */
public class Testfinal {

    static final String ORDER_MATERIAL_USED_FILE_KEY_FORMAT = "material_field_%s_%s";

    public static void main(String[] args) {

        //下面会报错
        //ORDER_MATERIAL_USED_FILE_KEY_FORMAT="error";
        String format = String.format(ORDER_MATERIAL_USED_FILE_KEY_FORMAT, "3", "4");
        System.out.println(format);
    }
}
