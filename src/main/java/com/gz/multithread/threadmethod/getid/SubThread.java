package com.gz.multithread.threadmethod.getid;

public class SubThread extends Thread {
    @Override
    public void run() {
        System.out.println(" name===== " + Thread.currentThread().getName() + "  id=====" + getId());
        super.run();
    }
}
