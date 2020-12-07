package com.gz.design.template;

public class SoyaMilk  extends AbsMilk{
    @Override
    public void method1() {
        System.out.println("A");
    }

    @Override
    public void method2() {
        System.out.println("B");
    }

    @Override
    public void method3() {
        System.out.println("C");
    }

    @Override
    protected boolean isHaveXX() {
        return false;
    }
}
