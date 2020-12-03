package com.gz.design.builder;

public abstract class Housebuilder {
    protected House house = new House();

    protected abstract void buildBisic();

    protected abstract void buildWalls();

    protected abstract void roofed();

    protected House Build() {
        return house;
    }
}
