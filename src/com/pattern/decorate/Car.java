package com.pattern.decorate;

/**
 * @author: cdf
 * @create: 2020-03-22 02:44
 **/
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}
