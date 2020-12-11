package com.gz.multithread.threadmethod.sleep;

public class SubThread extends Thread{
    @Override
    public void run() {
        for (int i=30;i>0;i--){
            try {
                System.out.println(i);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
