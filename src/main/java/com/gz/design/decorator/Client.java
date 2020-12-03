package com.gz.design.decorator;

public class Client {
    public static void main(String[] args) {
        Drink drink = new Espresso();
        System.out.println(drink.getDescription());
        drink = new Milk(drink);
        System.out.println(drink.getDescription());
        drink = new Chocolates(drink);
        System.out.println(drink.getDescription());

        System.out.println("一共花费了"+drink.cost());
    }
}
