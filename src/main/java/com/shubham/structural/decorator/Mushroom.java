package com.shubham.structural.decorator;

public class Mushroom extends ToppingDecorator {
    BasePizza pizza;
    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }
    int cost() {
        return pizza.cost() + 15;
    }
}
