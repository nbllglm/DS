package com.gz.multithread.threadsafe.visible;

import java.util.Random;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        new Thread(task).start();
        Thread.sleep(1000);
        task.cancel();
    }

    static class Task implements Runnable {
        private   boolean toCancel = false;

        @Override
        public void run() {
            while (!toCancel) {
                doSomthing();
                break;
            }
            if (toCancel) {
                System.out.println("bbbbbbb");
            } else {
                System.out.println("ccccccc");
            }
        }

        public void cancel() {
            this.toCancel = true;
        }

        private void doSomthing() {

            try {
                Thread.sleep(600);
                System.out.println("aaaaaaa");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
