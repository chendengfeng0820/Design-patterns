package com.pattern.strategy;

/**
 * @author: cdf
 * @create: 2020-03-21 23:10
 * 策略模式
 * 支付方式
 **/
public interface Strategy {
    public double getMoney(double money);
}
