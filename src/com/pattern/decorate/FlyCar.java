package com.pattern.decorate;

/**
 * @author: cdf
 * @create: 2020-03-22 02:45
 **/
public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}

	public void fly(){
		System.out.println("天上飞");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}
