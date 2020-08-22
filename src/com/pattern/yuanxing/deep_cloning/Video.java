package com.pattern.yuanxing.deep_cloning;

import java.util.Date;

/**
 * @ClassName Video
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-21 10:14
 **/
public class Video implements Cloneable {

    private String name;
    private Date time;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Video v = (Video) object;

        v.time = (Date) this.time.clone();
        return object;
    }

    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Video(String name, Date time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
