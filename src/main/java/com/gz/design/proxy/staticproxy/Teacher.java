package com.gz.design.proxy.staticproxy;

public class Teacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println("开始教书了");
    }
}
