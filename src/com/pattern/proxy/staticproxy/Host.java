package com.pattern.proxy.staticproxy;

/**
 * @author: cdf
 * @create: 2020-03-17 09:03
 **/
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
