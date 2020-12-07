package com.gz.design.proxy.dynamicproxy;

import javax.naming.Name;

public class Teacher implements ITeacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void teach() {
        System.out.println(name + "        开始教书了");
    }

    @Override
    public void sayhello() {
        System.out.println("hello");
    }
}
