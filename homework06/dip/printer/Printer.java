package dip.printer;

import dip.Report;

/**
 * Printer
 */
public class Printer {

    private Report report;
    private PrintInterface printType; 

    public Printer(Report report){
        this.report = report;
    }

    public void print(){
        if (printType==null) {
            System.out.println("Printer not defined.");
        } else {
        printType.output(report.getItems());
        }
    }

    public void setPrintType(PrintInterface printType) {
        this.printType = printType;
    }
}