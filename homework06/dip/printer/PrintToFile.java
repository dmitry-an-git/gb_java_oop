package dip.printer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import dip.ReportItem;

public class PrintToFile implements PrintInterface {

    public void output(List<ReportItem> items) {
        
        String fileName = "dip/report.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"Entries\": [\n");
            for (int i = 0; i < items.size(); i++) {
                writer.write("\t\t{\n");
                writer.write("\t\t\t\"description\":\""+items.get(i).getDescription()+"\",\n");
                writer.write("\t\t\t\"amount\":"+items.get(i).getAmount()+"\n");

                if (i != items.size() - 1) {
                    writer.write("\t\t},\n");
                } else {
                    writer.write("\t\t}\n");
                }
                  
            }
            writer.write("\t]\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Saved to file");
    }

}
