package com.gz.design.facade;

public class Screen {
    private static final Screen instance = new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Screen on");
    }

    public void off() {
        System.out.println("Screen off");
    }

    public void play() {
        System.out.println("Screen is palying");
    }
}
