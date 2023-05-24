package dip.printer;

import dip.Report;

/**
 * Printer
 */
public class Printer {

    private Report report;

    public Printer(Report report){
        this.report = report;
    }

    public void print(PrintInterface printerMethod){
        printerMethod.output(report.getItems());
    }
}