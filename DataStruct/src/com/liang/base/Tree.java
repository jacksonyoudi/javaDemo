package com.liang.base;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 排序二叉树
 * 1. 左子树上的所有节点都小于该节点
 * 2. 右子树上的所有节点都大于该节点
 * <p>
 * 左 < 父节点 < 右
 * <p>
 * <p>
 * 优点：
 * 1. 查找
 * 2. 遍历 左 当前 右
 * 3. 插入
 * 4. 删除
 * <p>
 * log2(N)
 * <p>
 * <p>
 * 不需要排序使用hash, 需要排序使用Tree
 */


public class Tree {

    public static void main(String[] args) {
        Map<String, String> t = new TreeMap<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o2);
                    }
                }
        );
        t.put("11", "C");
        t.put("B", "C");


        for (Map.Entry<String, String> kv : t.entrySet()) {
            System.out.println(kv.getKey() + ":" + kv.getValue());
        }


    }
}
