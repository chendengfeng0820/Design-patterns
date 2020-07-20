package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-16 23:40
 **/
public class XiaoMiLuYouQi implements LuYouQI {
    @Override
    public void start() {
        System.out.println("开启小米路由器");
    }

    @Override
    public void end() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openwifi() {
        System.out.println("小米路由器打开wifi");
    }
}
