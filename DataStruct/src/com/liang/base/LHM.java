package com.liang.base;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU缓存
 *  least Recently Used最近最少使用
 */


public class LHM {
    public static void main(String[] args) {
        Map<String, Integer> seqMap = new LinkedHashMap<String, Integer>();
        seqMap.put("c", 100);
        seqMap.put("d", 200);
        seqMap.put("e", 300);
        seqMap.put("f", 400);
        for (Map.Entry<String, Integer> entry : seqMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }


}
