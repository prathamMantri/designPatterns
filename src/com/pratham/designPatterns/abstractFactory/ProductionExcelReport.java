package com.pratham.designPatterns.abstractFactory;

public class ProductionExcelReport implements Reports {
    @Override
    public void generateReport() {
        System.out.println("Generating production excel reports");
    }
}
