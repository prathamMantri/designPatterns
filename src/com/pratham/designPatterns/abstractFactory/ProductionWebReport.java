package com.pratham.designPatterns.abstractFactory;

public class ProductionWebReport implements Reports {
    @Override
    public void generate() {
        System.out.println("Generating production web reports");
    }
}
