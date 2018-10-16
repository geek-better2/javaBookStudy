package com.geekbetter.designpattern.construction.adapter;

public class AdapaterClient {
    public static void main(String[] args) {
        Target target;
        target = new Adapter();
        target.request();

    }
}
