package com.geekbetter.designpattern.relation.observer;

/**
 * 观察者模式:观察者模式定义了一种一对多的依赖关系,让多个观察者对象同时监听
 * 某一个主题对象.这个主题对象在状态发生变化时,会通知所有观察者对象,是它们
 * 自动更新自己(有缺点,观察者对象不可能都是同一种方法,无法都实现接口中的同
 * 一种方法,解决:用事件委托实现不同观察者调不同方法,详情见<<大话设计模式>>)
 */
public class ObserverClient {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreateObserver(s,"X"));
        s.attach(new ConcreateObserver(s,"Y"));
        s.attach(new ConcreateObserver(s,"Z"));
        s.setSubjectState("XYZ");
        s.notifyObserver();
    }


}
