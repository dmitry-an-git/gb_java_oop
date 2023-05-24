package dip.printer;

import java.util.List;
import dip.ReportItem;

public class PrintToConsole implements PrintInterface {
    
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
