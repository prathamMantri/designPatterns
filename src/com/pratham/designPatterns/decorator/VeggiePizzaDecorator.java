package com.pratham.designPatterns.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator implements Pizza{


    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake(){
        super.bake();
        System.out.println("Adding veggies to decorate pizza");
    }

}
