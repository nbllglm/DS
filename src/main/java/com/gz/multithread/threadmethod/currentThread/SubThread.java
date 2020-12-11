package com.gz.multithread.threadmethod.currentThread;

public class SubThread  extends Thread{
    public SubThread() {
        System.out.println("SubThread=="+Thread.currentThread().getName());
    }

    @Override
    public void run() {
      System.out.println("run=="+Thread.currentThread().getName());
    }
}
