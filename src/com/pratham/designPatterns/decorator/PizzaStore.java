package com.pratham.designPatterns.decorator;

public class PizzaStore {
    public static void main(String[] args){
        Pizza pizza = new CheesePizzaDecorator(new VeggiePizzaDecorator(new PlainPizza()));
        pizza.bake();
    }
}
