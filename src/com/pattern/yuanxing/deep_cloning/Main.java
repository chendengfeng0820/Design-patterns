package com.pattern.yuanxing.deep_cloning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Main
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-21 13:51
 **/
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, ParseException {
        Date date = new Date();
        Video v1 = new Video("xxx", date);
        Video v2 = (Video) v1.clone();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm.SSS");
        String endTime = "2018-8-21 20:00:00.00";
        Date d2 = df.parse(endTime);
        v2.setTime(d2);
        System.out.println(v1);
        System.out.println(v2);
    }
}
