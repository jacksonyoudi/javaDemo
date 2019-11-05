package com.liang.base;

/**
 * 应该尽量避免在持有一个锁的同时去申请另一个锁，如果确实需要
 * 多个锁，所有代码都应该按照相同顺序去申请锁。
 *
 * 使用显式获取tryLock和带时间限制的获取锁的方法。使用这些方法可以在获取不到锁的时候
 * 释放已经持有的锁，然后再尝试获取锁或放弃，避免死锁。
 */

public class DeadLockDemo {
    private static Object lockA = new Object();
    private static Object lockB = new Object();

    private static void startThreadA() {
        Thread a = new Thread() {
            @Override
            public void run() {
                synchronized (lockA) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lockB) {

                    }
                }
            }
        };
    }

    private static void startThreadB() {
        Thread b = new Thread() {
            @Override
            public void run() {
                synchronized (lockB) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }


    public static void main(String[] args) {

    }
}
