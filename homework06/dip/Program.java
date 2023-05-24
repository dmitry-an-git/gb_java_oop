package dip;

import dip.printer.*;

public class Program {
    public static void main(String[] args) {

        Report report = new Report();
        report.calculate();
        Printer prt = new Printer(report);
        prt.print(); // returns an error message to the console
        prt.setPrintType(new PrintToConsole());
        prt.print(); 
        prt.setPrintType(new PrintToFile());
        prt.print();
        // report.output();
}
}
