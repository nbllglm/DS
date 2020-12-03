package com.gz.design.builder;

public class BuildeDirector {
    private Housebuilder housebuilder;

    public BuildeDirector(Housebuilder housebuilder) {
        this.housebuilder = housebuilder;
    }

    public BuildeDirector() {
    }

    public Housebuilder getHousebuilder() {
        return housebuilder;
    }

    public void setHousebuilder(Housebuilder housebuilder) {
        this.housebuilder = housebuilder;
    }

    House Build() {
        housebuilder.buildBisic();
        housebuilder.buildWalls();
        housebuilder.roofed();
        return housebuilder.Build();
    }

}
