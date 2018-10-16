package com.geekbetter.designpattern.create.builder;

public class ConCreateBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.add("部件A");

    }

    @Override
    public void buildPart2() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
