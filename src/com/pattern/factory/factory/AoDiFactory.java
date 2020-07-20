package com.pattern.factory.factory;

/**
 * @author: cdf
 * @create: 2020-03-16 22:02
 **/
public class AoDiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new AoDi();
    }
}
