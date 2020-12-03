package com.gz.design.bridge;

public abstract class AbsPhone {
    private Brand brand;

    public AbsPhone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
