package com.geekbetter.designpattern.relation.mediator;

public class ConcreateColleague1 extends Colleague {

    public ConcreateColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void myNotify(String message){
        System.out.println("同事1收到的消息为:"+message);
    }
}
