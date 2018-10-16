package com.geekbetter.designpattern.create.singleton;

public class Singleton {
    //饿汉式
    private static Singleton instance = new Singleton();


    //私有化构造器
    private Singleton(){

    }
    //静态方法返回唯一实例
    public static Singleton getInstance(){
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }



}
