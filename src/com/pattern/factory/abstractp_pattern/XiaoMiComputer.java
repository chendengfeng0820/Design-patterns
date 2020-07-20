package com.pattern.factory.abstractp_pattern;

/**
 * @author: cdf
 * @create: 2020-03-17 00:00
 **/
public class XiaoMiComputer implements Computer {
    @Override
    public void start() {
        System.out.println("小米电脑开机");
    }

    @Override
    public void end() {
        System.out.println("小米电脑关机");
    }

    @Override
    public void playGames() {
        System.out.println("小米电脑玩游戏");
    }
}
