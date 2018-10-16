package com.geekbetter.designpattern.construction.decorator;

public class Decorateclient {
    public static void main(String[] args) {
        Source source = new Source();
        Sourceable a = new Decorator(source);
        a.method1();
    }
}
