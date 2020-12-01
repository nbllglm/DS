package com.gz.test.lambda;

import java.util.function.Predicate;

public class predicateDemo {
    public static void main(String[] args) {
       System.out.println(asd(s -> s.length() > 3, "asd"));


    }

    static boolean asd(Predicate<String> stringPredicate, String q) {
        return stringPredicate.test(q);
    }
}
