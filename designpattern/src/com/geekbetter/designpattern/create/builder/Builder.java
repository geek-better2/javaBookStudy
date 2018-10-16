package com.geekbetter.designpattern.create.builder;

abstract class Builder {

    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract Product getResult();
}
