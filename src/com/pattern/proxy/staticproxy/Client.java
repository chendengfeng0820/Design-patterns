package com.pattern.proxy.staticproxy;

/**
 * @author: cdf
 * @create: 2020-03-17 09:05
 **/
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
