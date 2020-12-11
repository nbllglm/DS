package com.gz.multithread.threadmethod.daemon;

public class SubDaemonThread  extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("sub thread");
//            try {
//                sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }


        }
    }
}
