package com.liang.base;

import java.util.HashSet;
import java.util.Set;

public class Hs {

    public static void main(String[] args) {
        Set<String> st = new HashSet<>();
        st.add("1");
        st.add("2");


        for (String s : st) {
            System.out.println(s);
        }
    }
}
