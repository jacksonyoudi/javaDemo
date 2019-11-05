package com.liang.base;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Iterator
 *      hashNext()
 *      next()
 *      remove()
 *      forEachRemaining()
 *
 * 只要对象中实现了iterable接口，就可以使用foreach语法。
 *
 * 迭代器表示的是一种关注点分离的思想，将数据的实际组织方式与数据的迭代遍历相分离，是一种常见的设计模式。
 *
 *  ArrayList随机访问效率很高，但是插入和删除性能比较低
 */

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.remove(1);

        intList.isEmpty();
        intList.size();
        intList.lastIndexOf(2);


        for (Integer a : intList) {
            System.out.println(a);
        }

        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
