package com.pratham.designPatterns.abstractFactory;

public class PerformanceExcelReport implements Reports {
    @Override
    public void generateReport() {
        System.out.println("Generating performance excel reports");
    }
}
