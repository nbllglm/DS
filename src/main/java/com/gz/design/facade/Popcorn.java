package com.gz.design.facade;

public class Popcorn {
    private static final Popcorn instance = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Popcorn on");
    }

    public void off() {
        System.out.println("Popcorn off");
    }

    public void play() {
        System.out.println("Popcorn is palying");
    }
}
