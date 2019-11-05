package com.liang.leetcode;

import java.util.Stack;

public class ShowStack01 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("111");

        while (s.peek() != null) {
            System.out.print(s.pop());
        }
    }
}
