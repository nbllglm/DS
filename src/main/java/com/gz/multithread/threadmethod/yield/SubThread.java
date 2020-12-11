package com.gz.multithread.threadmethod.yield;

public class SubThread extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += 1;
            Thread.yield();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时为" + (end - begin));
    }
}
