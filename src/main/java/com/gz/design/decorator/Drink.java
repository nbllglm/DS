package com.gz.design.decorator;

public abstract class Drink {
    private String description;
    private float price = 0;

    public String getDescription() {
        return description + price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    abstract float cost();
}
