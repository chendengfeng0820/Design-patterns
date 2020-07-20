package com.pattern.strategy;

/**
 * @author: cdf
 * @create: 2020-03-21 23:15
 **/
public class Policy {

	private Strategy strategy;

	//set方法注入
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	//构造函数注入
	public Policy(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy name(String name){
		if(name.equals("ALiPay")){
			return new ALiPay();
		}
		if(name.equals("WeiXinPay")){
			return new WeiXin();
		}
		if(name.equals("JingDong")){
			return new JingDong();
		}
		return new ALiPay();
	}

	public void payMoney(double money){
		System.out.println("您需支付的金额为:"+strategy.getMoney(money));
	}

}
