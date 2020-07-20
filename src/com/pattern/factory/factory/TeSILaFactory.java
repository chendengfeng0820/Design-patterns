package com.pattern.factory.factory;

/**
 * @author: cdf
 * @create: 2020-03-16 21:59
 **/
public class TeSILaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new TeSiLa();
    }
}
