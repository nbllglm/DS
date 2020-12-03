package com.gz.design.builder;

public class CommonHouseBuilder extends Housebuilder {
    public CommonHouseBuilder() {
        house.setName("common");
    }

    @Override
    protected void buildBisic() {
        System.out.println(getClass().getName() + house.getName() + "  buildBisic");
    }

    @Override
    protected void buildWalls() {
        System.out.println(getClass().getName() + house.getName() + "  buildWalls");
    }

    @Override
    protected void roofed() {
        System.out.println(getClass().getName() + house.getName() + "  roofed");
    }
}
