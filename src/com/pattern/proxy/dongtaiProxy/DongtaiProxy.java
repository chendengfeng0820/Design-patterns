package com.pattern.proxy.dongtaiProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName DongtaiProxy
 * @Description TODO
 * @author: cdf
 * @Date: 2020-08-15 15:14
 **/
public class DongtaiProxy {
	public static void main(String[] args) {

		IProduce produce = new Produce();

		IProduce proxyInstance = (IProduce) Proxy.newProxyInstance(produce.getClass().getClassLoader(),
				produce.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						Float arg = (Float) args[0];
						Object returnvalue= null;
						returnvalue = method.invoke(produce, arg * 0.8f);
						return returnvalue;
					}
				});
		proxyInstance.sale(1000);
	}
}
