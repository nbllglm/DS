package com.gz.design.template;

public abstract class AbsMilk {
    protected void template() {
        method1();
        if (isHaveXX()) {
            method2();
        }
        method3();
    }

    public abstract void method1();

    public abstract void method2();

    public abstract void method3();

    protected boolean isHaveXX() {
        return true;
    }
}
