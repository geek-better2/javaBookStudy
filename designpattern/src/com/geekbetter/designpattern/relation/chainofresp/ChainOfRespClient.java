package com.geekbetter.designpattern.relation.chainofresp;

/**
 * 职责链模式(Chain of Responsibility):使多个对象都有机会处理请求,从而避免请求的发送者
 * 和接收者之间的耦合关系.将这个对象连成一条链,并沿着这条链传递该请求,直到有一个对象处理他为止
 */
public class ChainOfRespClient {

    public static void main(String[] args) {

        Handler h1 = new ConCreateHandler1();
        Handler h2 = new ConCreateHandler2();
        Handler h3 = new ConCreateHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        int[] request ={2,5,14,22,18,3,27,20};
        for (int i = 0; i <request.length ; i++) {
            h1.HandlerRequest(request[i]);
        }
    }
}
