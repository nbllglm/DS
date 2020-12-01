package com.gz.test;

public class GoodStudent extends Student {
    boolean isJava;

    public GoodStudent() {
    }

    public GoodStudent(String name, int point, String from) {
        super(name, point, from);
    }

    public boolean isJava() {
        return isJava;
    }

    public void setJava(boolean java) {
        isJava = java;
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "isJava=" + isJava +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", from='" + from + '\'' +
                '}';
    }
}
