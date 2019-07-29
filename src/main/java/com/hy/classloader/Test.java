package com.hy.classloader;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    public static void main(String[] args) throws Exception {

        while (true) {
            String path = "file:\\a\\";
            URL url = new URL(path);
            URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url});
            Class<?> aClass = urlClassLoader.loadClass("www");
            Object o = aClass.newInstance();
            Method say = aClass.getMethod("say");
            Object invoke = say.invoke(o);
            Thread.sleep(1000L);
        }
    }


}
