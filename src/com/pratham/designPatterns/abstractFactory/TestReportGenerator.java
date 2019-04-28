package com.pratham.designPatterns.abstractFactory;

public class TestReportGenerator {

    public static void main(String args[]) {


        String[] showReport = {"web", "excel"};
        String[] reportType = {"Production", "Performance"};
        for (int i = 0; i < showReport.length; i++)
            for (int j = 0; j < reportType.length; j++) {
                ReportsAbstractFactory reportsAbstractFactory = ReportGenerator.generate(showReport[i]);
                Reports reports = reportsAbstractFactory.generateReports(reportType[j]);
                reports.generate();
            }
    }

}
