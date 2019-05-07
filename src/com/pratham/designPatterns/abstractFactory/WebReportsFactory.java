package com.pratham.designPatterns.abstractFactory;

public class WebReportsFactory extends ReportsAbstractFactory {

   Reports reports = null;

    @Override
    public Reports show(String type) {
        if(type.equals("Production")){
            reports = new ProductionWebReport();
        }else if(type.equals("Performance")){
            reports = new PerformanceWebReport();
        }
        return reports;
    }
}
