package com.gz.multithread.threadmethod.daemon;

public class test {
    public static void main(String[] args) {
        SubDaemonThread subDaemonThread = new SubDaemonThread();
        subDaemonThread.setDaemon(true);
        subDaemonThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main ==="+ i);
        }
    }
}
