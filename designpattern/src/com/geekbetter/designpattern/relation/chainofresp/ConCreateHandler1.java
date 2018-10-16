package com.geekbetter.designpattern.relation.chainofresp;

public class ConCreateHandler1 extends Handler {

    @Override
    public void HandlerRequest(int request) {
        if (request>=0 && request<10) {
            System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
        }else if (successor!=null){
            //交给下一个人去处理请求
            successor.HandlerRequest(request);
        }
    }
}
