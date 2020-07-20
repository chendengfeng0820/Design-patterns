package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-16 23:41
 **/
public class HuaWeiLuYouQi implements LuYouQI {
    @Override
    public void start() {
        System.out.println("开启华为路由器");
    }

    @Override
    public void end() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openwifi() {
        System.out.println("打开华为wifi");
    }
}
