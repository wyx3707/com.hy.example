package com.hy.utils;

import java.security.MessageDigest;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-06-12 08:35
 **/
public class MD5Util {
    public static final String MD5(String str) {
        String ret = "";
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        try {
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(str.getBytes("utf-8"));
            byte[] md = mdInst.digest();
            int j = md.length;
            char[] arr = new char[j * 2];
            int k = 0;

            for (int i = 0; i < j; ++i) {
                byte b = md[i];
                arr[k++] = hexDigits[b >>> 4 & 15];
                arr[k++] = hexDigits[b & 15];
            }

            ret = new String(arr);
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        return ret;
    }
}
