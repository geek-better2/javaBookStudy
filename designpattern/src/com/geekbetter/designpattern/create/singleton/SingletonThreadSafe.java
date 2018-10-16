package com.geekbetter.designpattern.create.singleton;

public class SingletonThreadSafe {
     //懒汉式
    private static SingletonThreadSafe instance = null;

    //双重加锁模式防止多线程问题
    public static SingletonThreadSafe getInstance(){
        if(instance==null){
            synchronized (instance){
                if(instance==null){
                    instance = new SingletonThreadSafe();
                }
            }

        }
        return instance;

    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
