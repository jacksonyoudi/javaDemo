package com.liang.base;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * modCount++ 记录修改次数，便于迭代中检测结构性变化
 */
public class LL {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        List<String> list2 = new LinkedList<>(Arrays.asList(new String[]{
                "a", "b", "c"
        }));
        list.add("a");

        for (String a : list2) {
            System.out.println(a);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "\n");
        }
    }
}
