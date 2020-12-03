package com.gz.design.bridge;

public class UpRightPhone extends AbsPhone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.println("UpRightPhone");
        super.open();
    }

    @Override
    protected void close() {
        System.out.println("UpRightPhone");
        super.close();
    }

    @Override
    protected void call() {
        System.out.println("UpRightPhone");
        super.call();
    }
}
