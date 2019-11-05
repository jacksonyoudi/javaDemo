package com.liang.base;

import java.util.HashSet;
import java.util.Set;

public class Spec {
    String size;
    String color;

    public Spec(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", color:" + color + "]";
    }

    @Override
    public int hashCode() {
        return this.size.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    public static void main(String[] args) {
        Set<Spec> st = new HashSet<>();
        st.add(new Spec("M", "red"));
        st.add(new Spec("M", "red"));
        st.add(new Spec("L", "blue"));

        System.out.println(st);
    }
}
