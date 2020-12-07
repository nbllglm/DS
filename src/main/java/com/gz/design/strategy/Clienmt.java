package com.gz.design.strategy;

public class Clienmt {
    public static void main(String[] args) {
        Duck duck = new ToyDuck();
        duck.setFlyBehavior(new NoFly());
        duck.setQuickBehavior(new NoQuick());
        duck.print();
    }
}
