package com.gz.design.decorator;

public class Decaf extends Drink{
    public Decaf() {
        setDescription("普通咖啡");
        setPrice(4.0F);
    }
    @Override
    float cost() {
        return getPrice();
    }
}
