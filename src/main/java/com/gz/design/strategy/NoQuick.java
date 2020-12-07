package com.gz.design.strategy;

public class NoQuick implements QuickBehavior{
    @Override
    public void run() {
        System.out.println("不会跑");
    }
}
