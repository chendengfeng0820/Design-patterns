package com.pattern.single;

/**
 * @ClassName HungrySingle
 * @Description 饿汉式单例
 * @author: cdf
 * @Date: 2020-08-22 14:27
 **/
public class HungrySingle {

	private HungrySingle(){}

	private final static HungrySingle hungrySingle = null;

	public static HungrySingle getInstance(){
		return  hungrySingle;
	}
}
