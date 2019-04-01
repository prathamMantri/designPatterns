package com.pratham.designPatterns.decorator;

public class PlainPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Pizza");
    }
}
