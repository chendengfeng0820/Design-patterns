package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-16 23:58
 **/
public class HuaWeiComputer implements Computer {
    @Override
    public void start() {
        System.out.println("华为电脑开机");
    }

    @Override
    public void end() {
        System.out.println("华为电脑关机");
    }

    @Override
    public void playGames() {
        System.out.println("华为电脑玩游戏");
    }
}
