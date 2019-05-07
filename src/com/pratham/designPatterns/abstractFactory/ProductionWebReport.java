package com.pratham.designPatterns.abstractFactory;

public class ProductionWebReport implements Reports {
    @Override
    public void generateReport() {
        System.out.println("Generating production web reports");
    }
}
