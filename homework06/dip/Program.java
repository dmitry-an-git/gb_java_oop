package dip;

import dip.printer.*;

public class Program {
    public static void main(String[] args) {

        Report report = new Report();
        report.calculate();
        Printer prt = new Printer(report);
        prt.print(new PrintToConsole());
        prt.print(new PrintToFile());
        // report.output();
}
}
