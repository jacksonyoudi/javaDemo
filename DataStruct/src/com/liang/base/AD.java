package com.liang.base;

import java.util.ArrayDeque;

/**
 *  ArrayDeque实现双端队列，内部使用循环数组实现，
 *      两端添加和删除效率高，动态扩展需要的内存分配以及数组复制开销可以被平摊O(N)
 *      根据元素删除和查找效率是 O(N)
 *
 */
public class AD {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<String>();
        ad.add("a");
    }
}
