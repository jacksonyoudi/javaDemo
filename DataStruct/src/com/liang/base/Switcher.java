package com.liang.base;

/**
 * volatile 解决内存可见性
 */

public class Switcher {
    private volatile boolean on;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
