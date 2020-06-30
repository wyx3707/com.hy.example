package com.hy.utils;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-06-12 08:27
 **/
public class Base64Util {
    private static final String UTF8 = "utf-8";

    /**
     * base64加密
     *
     * @param src
     * @return
     */
    public static String base64Encoder(String src) {
        Base64 base64 = new Base64();

        try {
            return base64.encodeAsString(src.getBytes(UTF8));
        } catch (UnsupportedEncodingException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    /**
     * base64 解密
     *
     * @param dest
     * @return
     */
    public static String base64Decoder(String dest) {
        Base64 base64 = new Base64();

        try {
            return new String(base64.decode(dest), UTF8);
        } catch (UnsupportedEncodingException var3) {
            var3.printStackTrace();
            return null;
        }
    }
}
