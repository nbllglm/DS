package com.gz.jvm.classloader.test;

public class test1 {
    static String Fname = "Fname";
    int Fage = 0;

    static {
        Fname = "Fname-test1";
    }

    {
        Fage = 1;
    }

    public test1() {
        Fage = 2;
    }
}
