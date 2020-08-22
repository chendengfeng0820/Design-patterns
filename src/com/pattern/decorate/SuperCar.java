package com.pattern.decorate;

import java.util.ArrayList;

/**
 * @author: cdf
 * @create: 2020-03-22 02:44
 **/
public class SuperCar implements ICar {
    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
