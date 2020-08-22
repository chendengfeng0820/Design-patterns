package com.pattern.strategy;

/**
 * @author: cdf
 * @create: 2020-03-21 23:14
 **/
public class JingDong implements Strategy {
    @Override
    public double getMoney(double money) {
        System.out.println("使用京东支付打9折");
        return money * 0.9;
    }
}
