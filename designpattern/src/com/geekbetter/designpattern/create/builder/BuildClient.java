package com.geekbetter.designpattern.create.builder;

/**
 * 建设者模式(builder):将一个复杂对象的构建与它的表示分离,使得同样的构建过程
 * 可以创建不同的表示
 */
public class BuildClient {

    public static void main(String[] args) {
        Director director = new Director();
        //创建建造者
        Builder builder1 = new ConCreateBuilder1();
        //指挥者指挥建造者建造
        director.construct(builder1);
        //获取产品
        Product p3=builder1.getResult();
        //产品打印出来
        p3.show();

        //创建建造者2
        Builder builder2 = new ConCreateBuilder2();
        //指挥者指挥建造者建造
        director.construct(builder2);
        //获取产品
        Product p2=builder2.getResult();
        //产品打印出来
        p2.show();


    }

}
