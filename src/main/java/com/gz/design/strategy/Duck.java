package com.gz.design.strategy;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuickBehavior quickBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuickBehavior getQuickBehavior() {
        return quickBehavior;
    }

    public void setQuickBehavior(QuickBehavior quickBehavior) {
        this.quickBehavior = quickBehavior;
    }

    public abstract void print();

    public void fly() {
        if (getFlyBehavior() != null) {
            getFlyBehavior().fly();
        } else {
            System.out.println("会飞");
        }
    }

    public void run() {
        if (getQuickBehavior() != null) {
            getQuickBehavior().run();
        } else {
            System.out.println("会跑");
        }
    }
}
