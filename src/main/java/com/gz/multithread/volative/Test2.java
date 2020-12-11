package com.gz.multithread.volative;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new MyThread().start();
        }
    }

    static class MyThread extends Thread {
        private static int count = 0;

        private void add() {
            synchronized (MyThread.class) {
                for (int i = 0; i < 100; i++) {
                    count++;
                }
                System.out.println(Thread.currentThread().getName() + "    " + count);
            }
        }

        @Override
        public void run() {
            add();
        }
    }
}
