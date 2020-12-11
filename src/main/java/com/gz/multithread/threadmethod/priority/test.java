package com.gz.multithread.threadmethod.priority;

public class test {
    public static void main(String[] args) {
        SubThread1 subThreadA=new SubThread1();
        subThreadA.setPriority(1);
        SubThread2 subThreadB=new SubThread2();
        subThreadB.setPriority(10);
        subThreadA.start();
        subThreadB.start();
    }
}
