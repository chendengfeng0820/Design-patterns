package com.pattern.strategy;

/**
 * @author: cdf
 * @create: 2020-03-21 23:16
 **/
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ALiPay();
        Strategy strategy1 = new WeiXin();
        Policy policy = new Policy(strategy);
        Policy policy1 = new Policy(strategy1);

        policy.payMoney(1000);
        policy1.payMoney(1000);


    }
}
