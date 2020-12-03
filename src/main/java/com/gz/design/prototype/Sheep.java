package com.gz.design.prototype;

import java.io.Serializable;

public class Sheep implements Cloneable, Serializable {
    private static final long serialVersionUID = -609265977339318357L;
    private String name;
    private int age;
    private String color;
    private Sheep friend;


    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend.hashCode() +
                '}';
    }

//    @Override
//    protected Sheep clone() {
//        Sheep sheep = null;
//        try {
//            sheep = (Sheep) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return sheep;
//    }


    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        if(this.friend!=null){
            sheep.friend = this.friend.clone();
        }
        return sheep;
    }
}
