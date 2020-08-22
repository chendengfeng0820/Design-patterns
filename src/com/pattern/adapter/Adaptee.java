package com.pattern.adapter;

/**
 * @author: cdf
 * @create: 2020-03-22 01:22
 * 网线 电脑 与usb转换器
 * 网线
 **/
public class Adaptee {
    public void request() {
        System.out.println("连接成功，可以上网");
    }
}
