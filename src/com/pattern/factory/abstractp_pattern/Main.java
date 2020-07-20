package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-16 23:51
 **/
public class Main {

    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Phone phone1 = huaWeiFactory.cratePhone();
        Phone phone = new HuaWeiFactory().cratePhone();
        phone.call();
        phone.start();
        phone.sendmsg();

        LuYouQI luYouQi = new XiaoMiFactory().createLuYouQi();
        luYouQi.end();
        luYouQi.openwifi();

        Computer computer = new XiaoMiFactory().createCoputer();
        computer.start();


    }
}
