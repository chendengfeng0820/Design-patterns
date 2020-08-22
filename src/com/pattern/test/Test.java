package com.pattern.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: cdf
 * @create: 2020-03-27 22:37
 **/
public class Test {
    public static void main(String[] args) {
        int[] a = new int[8];

        HashMap map = new HashMap(5);
        System.out.println(map.entrySet());

        for (int i = 1; i < 9; i++) {
            map.put(i, i);
        }

        System.out.println(map.entrySet());

        Set<Map.Entry> set = map.entrySet();
//		System.out.println(set);
    }
}
