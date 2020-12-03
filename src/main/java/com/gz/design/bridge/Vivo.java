package com.gz.design.bridge;

public class Vivo implements Brand {
    @Override
    public void call() {
        System.out.println("Vivo calling");
    }

    @Override
    public void open() {
        System.out.println("Vivo openning");
    }

    @Override
    public void close() {
        System.out.println("Vivo closing");
    }
}
