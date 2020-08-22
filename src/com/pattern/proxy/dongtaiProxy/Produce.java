package com.pattern.proxy.dongtaiProxy;

/**
 * @ClassName Produce
 * @Description TODO
 * @author: cdf
 * @Date: 2020-08-15 15:12
 **/
public class Produce implements IProduce {
	@Override
	public void sale(float money) {
		System.out.println("生产厂家卖了产品，收到" + money + "钱");
	}
}
