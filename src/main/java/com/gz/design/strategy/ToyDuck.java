package com.gz.design.strategy;

public class ToyDuck extends Duck {

    @Override
    public void print() {
        System.out.println("玩具鸭");
        fly();
        run();
    }
}
