package com.pattern.adapter;

/**
 * @author: cdf
 * @create: 2020-03-22 01:27
 **/
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        AdapterImpl adapter = new AdapterImpl(adaptee);

        computer.net(adapter);
    }
}
