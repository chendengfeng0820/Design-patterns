package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-16 23:39
 **/
public class HuaWeiPhone implements Phone {
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendmsg() {
        System.out.println("华为手机发信息");
    }
}
