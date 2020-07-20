package com.pattern.factory.simple;

/**
 * @author: cdf
 * @create: 2020-03-16 21:53
 **/
public class Main {

    public static void main(String[] args) {

        Car car = CarFactory.create("五菱宏光");
        car.getname();


        Car car1 = CarFactory.create("特斯拉");
        car1.getname();
    }
}
