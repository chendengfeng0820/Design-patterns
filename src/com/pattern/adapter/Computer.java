package com.pattern.adapter;

/**
 * @author: cdf
 * @create: 2020-03-22 01:24
 **/
public class Computer {
	public void net(AdapterImpl adapter){
		adapter.handleRequest();
	}
}
