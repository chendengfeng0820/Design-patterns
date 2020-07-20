package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-16 23:49
 **/
public class XiaoMiFactory implements AbstractMethod {
    @Override
    public LuYouQI createLuYouQi() {
        return new XiaoMiLuYouQi();
    }

    @Override
    public Phone cratePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Computer createCoputer() {
        return new XiaoMiComputer();
    }
}
