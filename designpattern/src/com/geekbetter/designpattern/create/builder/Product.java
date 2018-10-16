package com.geekbetter.designpattern.create.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    /**
     * 为产品添加部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * 展示产品的每个部件
     */
    public void show(){
        System.out.println("产品,创建--");
        for (String part :parts) {
            System.out.println("每个部件分别是:"+part);

        }

        }

    }

