package com.gz.test;

public class Student {
    String name;
    int point;
    String from;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", from='" + from + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, int point, String from) {
        this.name = name;
        this.point = point;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
