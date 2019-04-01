package com.pratham.designPatterns.decorator;

public class CheesePizzaDecorator extends PizzaDecorator implements Pizza{


    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake(){
        super.bake();
        System.out.println("Adding cheese to decorate pizza");
    }

}
