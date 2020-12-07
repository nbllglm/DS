package com.gz.design.facade;

public class Stereo {
    private static final Stereo instance = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void play() {
        System.out.println("Stereo is palying");
    }
}
