package com.gz.test.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testLambdaDemo1 {
    public static void main(String[] args) {
        String q = "123";
        String w = "asd";
        String e = "zxc";
        asd(1, () -> {
            System.out.println(q + w + e);
        });
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.submit(()->{System.out.println(Thread.currentThread().getName());});


    }

    static void asd(int a, testLambda1 lambda1) {
        if (a == 1) {
            lambda1.sayMessage();
        }

    }



}
