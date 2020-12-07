package com.gz.design.oberserver;

public class CurrentConditions implements Observer {
    private String name;

    @Override
    public void update(String s1, String s2) {
        System.out.println(name + s1 + s2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CurrentConditions{" +
                "name='" + name + '\'' +
                '}';
    }
}
