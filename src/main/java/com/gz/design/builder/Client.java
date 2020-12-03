package com.gz.design.builder;

public class Client {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        BuildeDirector buildeDirector = new BuildeDirector();
        buildeDirector.setHousebuilder(commonHouseBuilder);
        System.out.println(buildeDirector.Build());
    }
}
