package com.gz.design.decorator;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    float cost() {
        return getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + super.getPrice() + drink.getDescription() ;
    }

}
