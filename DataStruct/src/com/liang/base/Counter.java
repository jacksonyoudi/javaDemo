package com.liang.base;

public class Counter {
    private int count;

    public synchronized void incr() {
        count++;
    }

    // 加上synchronized，同步， 就是原子操作了
    public synchronized int getCount() {
        return count;
    }
    // synchronized实例方法实际保护的是同一个对象的方法调用，确保同时只能有一个线程执行。

    // synchronized 是保护对象而非代码，只要访问的是同一个对象的synchronized方法，即使是
    // 不同代码，也会被顺序访问。


    public void setCount(int count) {
        synchronized (this) {
            this.count = count;
        }
    }
}
