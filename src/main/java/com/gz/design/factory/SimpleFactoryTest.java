package com.gz.design.factory;

import java.io.BufferedInputStream;

public class SimpleFactoryTest {
    public static void main(String[] args) {
    }
}

abstract class Pizza {
    private String name;

    abstract void prepare();

    void bake() {
        System.out.println(name + "     baking");
    }

    void cut() {
        System.out.println(name + "     cutting");
    }

    void box() {
        System.out.println(name + "     boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class FruitPizza extends Pizza {

    @Override
    void prepare() {
        setName("水果披萨");
    }

}

class CheesePizza extends Pizza {
    @Override
    void prepare() {
        setName("芝士披萨");
    }

}

class GreekPizza extends Pizza {
    @Override
    void prepare() {
        setName("希腊披萨");
    }
}

class OrderPizza {
    PizzaFactory pizzaFactory;
    Pizza pizza;

    public void setPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    void Order(int type) {
        pizza = this.pizzaFactory.createPizza(type);
        if (pizza != null) {
            System.out.println(pizza.getClass());
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}

class PizzaFactory {
    public Pizza createPizza(int type) {
        System.out.println("使用pizza工厂");
        Pizza pizza;
        switch (type) {
            case 1:
                pizza = new FruitPizza();
                break;
            case 2:
                pizza = new CheesePizza();
                break;
            case 3:
                pizza = new GreekPizza();
                break;
            default:
                pizza = new Pizza() {
                    @Override
                    void prepare() {
                        setName("要做默认披萨");
                    }
                };
                break;
        }
        return pizza;
    }
}
