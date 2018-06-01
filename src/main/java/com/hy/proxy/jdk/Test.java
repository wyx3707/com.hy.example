package com.hy.proxy.jdk;

public class Test {
    public static void main(String[] args) {
        IlogService logService=new LogService();
        IlogService logService1 = new LogProxy(logService).getLogService();
        logService1.add();
        logService1.delete();
    }
}
