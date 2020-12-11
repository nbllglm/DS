package com.gz.multithread.threadsafe.atom;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    //线程安全的AtomicInteger保证了原子性
    private  static AtomicInteger a=new AtomicInteger();
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"    "+a.getAndIncrement());
                }

            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"    "+a.getAndIncrement());
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
