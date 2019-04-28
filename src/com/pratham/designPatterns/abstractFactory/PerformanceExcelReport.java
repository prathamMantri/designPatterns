package com.pratham.designPatterns.abstractFactory;

public class PerformanceExcelReport implements Reports {
    @Override
    public void generate() {
        System.out.println("Generating performance excel reports");
    }
}
