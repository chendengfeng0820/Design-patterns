package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-16 23:50
 **/
public class HuaWeiFactory implements AbstractMethod {
    @Override
    public LuYouQI createLuYouQi() {
        return new HuaWeiLuYouQi();
    }

    @Override
    public Phone cratePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Computer createCoputer() {
        return new HuaWeiComputer();
    }
}
