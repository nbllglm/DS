package com.gz.multithread.volative;

public class Test {
    public static void main(String[] args) {
        PrintString printString = new PrintString();


        new Thread(new Runnable() {
            @Override
            public void run() {
                printString.method();
            }
        }).start();


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                printString.setContinuePrint(false);
//            }
//        }).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printString.setContinuePrint(false);
    }

    static class PrintString {
        private volatile boolean continuePrint = true;

        public boolean isContinuePrint() {
            return this.continuePrint;
        }

        public void setContinuePrint(boolean continuePrint) {
            System.out.println("修改");
            this.continuePrint = continuePrint;
        }

        public void method() {
            System.out.println(Thread.currentThread().getName() + "  begin()");
            while (isContinuePrint()) {

            }
            System.out.println(Thread.currentThread().getName() + "  end()");
        }
    }
}
