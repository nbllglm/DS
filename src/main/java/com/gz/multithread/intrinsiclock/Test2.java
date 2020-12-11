package com.gz.multithread.intrinsiclock;

import jdk.jfr.Unsigned;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Pub pub = new Pub();
        Thread1 thread=new Thread1(pub);
        thread.start();
        Thread.sleep(200);
        pub.getData();

    }


    static class Thread1 extends Thread {
        private Pub pub;

        public Thread1(Pub pub) {
            this.pub = pub;
        }

        @Override
        public void run() {
            pub.setData("ccc", "456");
        }
    }


    static class Pub {
        private String user = "aaa";
        private String pwd = "123";

        public synchronized void getData() {
            System.out.println(Thread.currentThread().getName() + "    " + this);
        }

        public synchronized void setData(String a, String b) {
            this.user = a;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.pwd = b;


           // System.out.println(Thread.currentThread().getName() + "    " + this);


        }

        @Override
        public String toString() {
            return "pub{" +
                    "user='" + user + '\'' +
                    ", pwd='" + pwd + '\'' +
                    '}';
        }
    }
}
