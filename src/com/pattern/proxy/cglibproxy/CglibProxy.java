package com.pattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibProxy
 * @Description TODO
 * @author: cdf
 * @Date: 2020-08-15 15:51
 **/
public class CglibProxy {

	public static void main(String[] args) {

		Produce produce = new Produce();
		Produce proxyInstance = (Produce) Enhancer.create(produce.getClass(), new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				Object returnvalue = null;
				Float arg = (Float) objects[0];
				returnvalue = method.invoke(produce, arg * 0.8f);
				return returnvalue;
			}
		});
		proxyInstance.sale(1000f);
	}

}
