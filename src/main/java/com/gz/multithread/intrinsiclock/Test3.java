package com.gz.multithread.intrinsiclock;

public class Test3 {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread myThread1=new MyThread();
        myThread1.setName("a");
        Thread myThread2=new MyThread();
        myThread2.setName("b");
        myThread1.start();
    //    myThread2.start();
    }

    private static class MyThread extends Thread {


        @Override
        public void run() {
            if ("a".equals(Thread.currentThread().getName())) {
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName()+"获得了lock1");
                    synchronized (lock2) {
                        System.out.println(Thread.currentThread().getName()+"获得了lock2");
                        System.out.println(Thread.currentThread().getName()+"准备释放lock2");
                        System.out.println(Thread.currentThread().getName()+"准备释放lock1");
                    }
                }
            } else {
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName()+"获得了lock2");
                    synchronized (lock1) {
                        System.out.println(Thread.currentThread().getName()+"准备释放lock2");
                        System.out.println(Thread.currentThread().getName()+"获得了lock1");
                        System.out.println(Thread.currentThread().getName()+"准备释放lock1");
                    }
                }
            }
        }
    }
}
