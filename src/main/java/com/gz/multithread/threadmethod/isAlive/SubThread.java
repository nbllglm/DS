package com.gz.multithread.threadmethod.isAlive;

public class SubThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+isAlive());
        super.run();
    }
}
