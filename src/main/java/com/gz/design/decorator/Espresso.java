package com.gz.design.decorator;

public class Espresso extends Drink {
    public Espresso() {
        setDescription("意大利咖啡");
        setPrice(5.0F);
    }

    @Override
    float cost() {
        return getPrice();
    }
}
