package com.gz.design.decorator;

public class Chocolates extends Decorator {
    public Chocolates(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(3.0F);
    }
}
