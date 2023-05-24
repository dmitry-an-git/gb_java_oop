package dip.printer;

import java.util.List;
import dip.ReportItem;

public interface PrintInterface {

    public void output(List<ReportItem> items);
    
}
