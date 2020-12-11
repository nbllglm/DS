package com.gz.multithread.threadmethod.interrupt;

public class SubThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <= 500; i++) {
            if (isInterrupted()) {
                System.out.println("当前线程的终端标致为true,我要退出了");
                return;
            }
            System.out.println("sub thread --> " + i);
        }
    }
}
