package com.hy.builder;

public class MyBuilderClass {

    private String name;
    private String age;
    private String address;

    public MyBuilderClass(copyClass b){
        this.name=b.name;
        this.age=b.age;
        this.address=b.address;
    }
    public static class copyClass {
        private String name;
        private  String age;
        private String address;
        public copyClass name(String name) {
            this.name=name;
            return this;
        }
        public copyClass age(String age) {
            this.age=age;
            return this;
        }
        public copyClass address(String address) {
            this.address=address;
            return this;
        }

        public MyBuilderClass builder(){
            return new MyBuilderClass(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
