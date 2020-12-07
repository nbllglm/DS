package com.gz.design.template;

public class Client {
    public static void main(String[] args) {
        AbsMilk milk = new SoyaMilk();
        milk.template();
    }
}
