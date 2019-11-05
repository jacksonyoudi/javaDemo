package com.liang.base;

/**
 * 以下 synchronized是保护的类对象
 *
 * synchronized同步的对象可以是任意对象，任意对象都有一个锁和等待的队列，或者说
 * 任何对象都可以作为锁对象
 *
 *
 *
 * 可重入锁，是通过记录锁的持有线程和持有数量来实现的。 当调用被 synchronized保护的代码是
 * 检查对象是否已被锁，如果是，再检查是否被当前线程锁定，如果是，增加持有数量，如果不是被当前线程锁定，才加入
 * 等待队列。当释放锁时， 减少持有数量，当数量变为0时才释放整个锁。
 */

public class StaticConter {
    private static int count = 0;

    public static synchronized void incr() {
        count++;
    }

    public static synchronized int getCount() {
        return count;
    }
}
