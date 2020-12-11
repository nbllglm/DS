package com.gz.multithread.intrinsiclock;

public class Test1 {
    private static final Object OBJ = new Object();

    public static void main(String[] args) {
        Test1 test = new Test1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.getasd();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.getasd();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                getqwe();
            }
        }).start();
    }


    void getasd() {
        synchronized (OBJ) {//this为当前实例
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "    " + i);
            }
        }
    }

    static synchronized void getqwe() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "    " + i);
        }

    }


}
