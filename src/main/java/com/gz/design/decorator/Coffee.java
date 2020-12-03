package com.gz.design.decorator;

public class Coffee extends Drink {
    @Override
    float cost() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() +super.getPrice();
    }
}
