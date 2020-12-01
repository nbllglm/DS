package com.gz.jvm.runtimedata.heap;

public class HeapTest2 {
    public static void main(String[] args) {
        new Thread(()->{
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
