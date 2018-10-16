package com.geekbetter.designpattern.create.builder;

public class Director {

    public void construct(Builder builder){
        builder.buildPart1();
        builder.buildPart2();
    }
}
