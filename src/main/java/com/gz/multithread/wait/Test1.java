package com.gz.multithread.wait;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    private static final List<String> list=new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
            thread1.start();
            thread2.start();
        thread1.join();
            System.out.println(list.size());
    }

   static Thread thread1=new Thread(new Runnable() {
        @Override
        public void run() {
           synchronized (list){
                if(list.size()!=5){
                    try {
                        System.out.println(Thread.currentThread().getName()+"   开始等待"+list.size());
                        list.wait();
                        System.out.println(Thread.currentThread().getName()+"   唤醒成功"+list.size());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
           }
        }
    });

    static Thread thread2=new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (list){
                for (int i = 0; i < 10; i++) {
                    list.add(i+"");
                    System.out.println(list.get(i));
                    if(list.size()==5){
                        list.notify();
                        System.out.println(Thread.currentThread().getName()+"   发出唤醒"+list.size());
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    });
}
