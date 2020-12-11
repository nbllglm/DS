package com.gz.multithread.threadmethod.interrupt;

public class test {
    public static void main(String[] args) {
        SubThread2 subThread2 = new SubThread2();
        subThread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "       " + i);
        }
        subThread2.interrupt();
    }
}
