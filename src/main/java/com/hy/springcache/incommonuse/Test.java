package com.hy.springcache.incommonuse;

public class Test {

    static CacheManager<Student> studentCacheManager = null;

    public static void main(String[] args) {
        studentCacheManager = new CacheManager<>();
        Student key = getStudent("key");
        System.out.println(key.getName());
        Student key1 = getStudent("key");
        System.out.println(key1.getName());
    }

    public static Student getStudent(String key) {
        Student value = studentCacheManager.getValue(key);
        if (value != null) {
            System.out.println("从缓存中读取");
            return value;
        }
        Student student = new Student();
        student.setName("wws");
        studentCacheManager.addCache("key", student);
        return student;
    }
}
