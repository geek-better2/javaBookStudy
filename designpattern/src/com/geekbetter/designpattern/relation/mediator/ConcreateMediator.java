package com.geekbetter.designpattern.relation.mediator;

public class ConcreateMediator extends Mediator{
    private ConcreateColleague1 colleague1;
    private ConcreateColleague2 colleague2;

    public ConcreateColleague1 getColleague1() {
        return colleague1;
    }

    public ConcreateColleague2 getColleague2() {
        return colleague2;
    }

    public void setColleague1(ConcreateColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreateColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague==colleague1){
            colleague2.myNotify(message);
        }else{
            colleague1.myNotify(message);
        }
    }
}
