package com.gz.test.generic;

import com.gz.test.annotation.MyAnnotation1;

public class Test {
    @MyAnnotation1
    public static void main(String[] args) throws Exception{
        ThreadTest test  =new ThreadTest();
        //test.setName("one");
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        /**
         * 主线程向下转时，碰到了t1.join(),t1要申请加入到运行中来，就是要CPU执行权。
         * 这时候CPU执行权在主线程手里，主线程就把CPU执行权给放开，陷入冻结状态。
         * 活着的只有t1了，只有当t1拿着执行权把这些数据都打印完了，主线程才恢复到运行中来
         */
        //join 方法 确保 t1执行之后 执行t2
        //Thread.yield();
        t2.start();

    }


   static class ThreadTest implements Runnable{

        private String name;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + "------" + i);
                }

        }

    }


}
