package com.geekbetter.designpattern.relation.observer;

/**
 * @author hai
 */
public class ConcreateObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreateObserver(ConcreteSubject subject,String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState=subject.getSubjectState();
        System.out.println("观察者"+name+"的新状态是"+observerState);

    }
}
