package com.pattern.yuanxing;

import java.util.Date;

/**
 * @author: cdf
 * @create: 2020-03-17 08:19
 **/
public class YuanXing implements Cloneable{
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public YuanXing(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "YuanXing{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
