package com.pratham.designPatterns.abstractFactory;

public class PerformanceWebReport implements Reports {
    @Override
    public void generateReport() {
        System.out.println("Generating performance web reports");
    }
}
