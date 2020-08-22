package com.pattern.yuanxing.shallow_cloning;

import com.sun.media.jfxmedia.control.VideoRenderControl;

import java.util.Date;

/**
 * @author: cdf
 * @create: 2020-03-17 08:20
 **/
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Video v = new Video("BLBL", new Date());
        System.out.println(v.toString());

        Video v2 = (Video) v.clone();
        System.out.println(v2.toString());


    }
}
