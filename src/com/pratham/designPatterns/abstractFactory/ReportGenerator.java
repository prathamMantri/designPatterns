package com.pratham.designPatterns.abstractFactory;

public class ReportGenerator {

    public static ReportsAbstractFactory generate(String factoryType){
        ReportsAbstractFactory reportsAbstractFactory = null;
        if(factoryType.equals("web")){
            reportsAbstractFactory = new WebReportsFactory();
        }else if(factoryType.equals("excel")){
            reportsAbstractFactory = new ExcelReportsFactory();
        }
        return reportsAbstractFactory;
    }

}
