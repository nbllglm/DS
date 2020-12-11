package com.gz.multithread.threadmethod.currentThread;

public class SubThread2  extends Thread{
    public SubThread2() {
        System.out.println("SubThread2()的Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println("SubThread2()的this.getName()"+this.getName());
    }

    @Override
    public void run() {
        System.out.println("run()的Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println("run()的this.getName()"+this.getName());
        super.run();
    }
}
