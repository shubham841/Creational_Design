package com.shubham.structural.decorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    int cost() {
        return pizza.cost() + 5;
    }
}
