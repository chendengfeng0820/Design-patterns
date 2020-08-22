package com.pattern.factory.simple;

/**
 * @author: cdf
 * @create: 2020-03-16 21:51
 **/
public class CarFactory {
    public static Car create(String name) {
        if (name.equals("五菱宏光")) {
            return new WuLing();
        } else if (name.equals("特斯拉")) {
            return new TeSiLa();
        } else {
            return null;
        }
    }
}
