package com.pratham.designPatterns.abstractFactory;

public class ExcelReportsFactory extends ReportsAbstractFactory {

   Reports reports = null;

    @Override
    public Reports generateReports(String type) {
        if(type.equals("Production")){
            reports = new ProductionExcelReport();
        }else if(type.equals("Performance")){
            reports = new PerformanceExcelReport();
        }
        return reports;
    }
}
