package com.gz.design.bridge;

public class Oppo implements Brand {
    @Override
    public void call() {
        System.out.println("oppo calling");
    }

    @Override
    public void open() {
        System.out.println("oppo openning");
    }

    @Override
    public void close() {
        System.out.println("oppo closing");
    }
}
