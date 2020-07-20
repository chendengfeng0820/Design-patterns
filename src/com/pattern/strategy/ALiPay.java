package com.pattern.strategy;

/**
 * @author: cdf
 * @create: 2020-03-21 23:13
 **/
public class ALiPay implements Strategy {
	@Override
	public double getMoney(double money) {
		System.out.println("使用支付宝支付打75折");
		return money*0.75;
	}
}
