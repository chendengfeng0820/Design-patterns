package com.pattern.factory.factory;

/**
 * @author: cdf
 * @create: 2020-03-16 22:00
 **/
public class Main {
    public static void main(String[] args) {
        WuLingFactory wuLingFactory = new WuLingFactory();
        Car car = wuLingFactory.getCar();
        car.getname();

        System.out.println("===============");

        Car car1 = new TeSILaFactory().getCar();
        car1.getname();

        System.out.println("===============");

        Car car2 = new AoDiFactory().getCar();
        car2.getname();
    }
}
