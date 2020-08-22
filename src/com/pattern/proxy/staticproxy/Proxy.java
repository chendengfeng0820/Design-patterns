package com.pattern.proxy.staticproxy;

/**
 * @author: cdf
 * @create: 2020-03-17 09:02
 **/
public class Proxy implements Rent {

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }


}
