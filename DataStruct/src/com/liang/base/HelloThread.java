package com.liang.base;

public class HelloThread extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread ht = new HelloThread();
        ht.join();

    }


}
