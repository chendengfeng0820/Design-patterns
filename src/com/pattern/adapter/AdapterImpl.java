package com.pattern.adapter;

/**
 * @author: cdf
 * @create: 2020-03-22 01:25
 **/
public class AdapterImpl   implements Adapter {
	private Adaptee adaptee;

	public AdapterImpl(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handleRequest() {
		adaptee.request();
	}
}
