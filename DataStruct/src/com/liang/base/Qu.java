package com.liang.base;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue队列
 * Deque 双端队列 -> 可用来做栈
 * LinkedList线程不安全的
 */

public class Qu {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();
        qu.offer("a");
        qu.offer("b");
        qu.offer("c");
        qu.offer("d");

        Deque<String> stack = new LinkedList<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");


        while (stack.peek() != null) {
            System.out.println(stack.pop());
        }
    }

}
