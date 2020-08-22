package com.pattern.decorate;

/**
 * @author: cdf
 * @create: 2020-03-22 02:51
 **/
public class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水里游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
