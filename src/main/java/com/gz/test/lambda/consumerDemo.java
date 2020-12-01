package com.gz.test.lambda;

import java.util.function.Consumer;

public class consumerDemo {

    public static void main(String[] args) {

        pr(s -> {System.out.println(s);},s -> {
            System.out.println(new StringBuffer(s).reverse().toString());
        }, "我是谁啊");
    }

    static void pr(Consumer<String> consumer1,Consumer<String> consumer2 ,String a) {
        consumer1.andThen(consumer2).accept(a);
    }
}
