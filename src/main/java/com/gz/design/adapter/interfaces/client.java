package com.gz.design.adapter.interfaces;

public class client {
    public static void main(String[] args) {
        AbsAdapter adapter1 = new AbsAdapter() {
            @Override
            public void method1() {
                System.out.println("AAAAA");
            }
        };
        AbsAdapter adapter2 = new AbsAdapter() {
        };
        adapter1.method1();
        adapter2.method1();
    }
}
