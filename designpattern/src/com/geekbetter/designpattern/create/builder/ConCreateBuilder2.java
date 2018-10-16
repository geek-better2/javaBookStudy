package com.geekbetter.designpattern.create.builder;

public class ConCreateBuilder2 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPart1() {
       product.add("部件1");
    }

    @Override
    public void buildPart2() {
        product.add("部件2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
