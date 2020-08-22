package com.pattern.decorate;

import java.util.ArrayList;

/**
 * @author: cdf
 * @create: 2020-03-22 02:50
 **/
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("==========");

        WaterCar waterCar = new WaterCar(new FlyCar(car));
        waterCar.move();


    }
}
