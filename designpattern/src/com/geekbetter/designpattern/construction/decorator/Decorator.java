package com.geekbetter.designpattern.construction.decorator;

public class Decorator implements Sourceable {

    private Source source;

    public Decorator(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        System.out.println("before decorate");
        source.method1();
        System.out.println("after decorate");

    }
}
