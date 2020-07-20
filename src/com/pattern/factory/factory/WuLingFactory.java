package com.pattern.factory.factory;

/**
 * @author: cdf
 * @create: 2020-03-16 21:58
 **/

public class WuLingFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new WuLing();
    }
}
