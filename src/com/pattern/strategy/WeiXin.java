package com.pattern.strategy;

/**
 * @author: cdf
 * @create: 2020-03-21 23:11
 **/
public class WeiXin implements Strategy{
	@Override
	public double getMoney(double money) {
		System.out.println("使用微信支付打85折");
		return money*0.85;
	}
}
