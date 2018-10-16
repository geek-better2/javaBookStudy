package com.geekbetter.designpattern.relation.mediator;

/**
 * 中介者模式(Mediator):用一个中介对象来封装一系列的对象交互.
 *    中介者使各对象不需要显示的相互引用,从而使其耦合松散,而且
 *    可以独立的改变它们之间的交互
 */
public class MediatorClient {
    public static void main(String[] args) {
        ConcreateMediator m = new ConcreateMediator();
        ConcreateColleague1 c1 = new ConcreateColleague1(m);
        ConcreateColleague2 c2 = new ConcreateColleague2(m);
        m.setColleague1(c1);
        m.setColleague2(c2);
        c1.send("早上吃了吗");
        c2.send("没呢,你打算请我吃啥?");
    }
}
