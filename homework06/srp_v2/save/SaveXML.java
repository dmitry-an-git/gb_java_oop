package srp_v2.save;

import java.io.FileWriter;
import java.io.IOException;

public class SaveXML extends Save {

    @Override
    public void saveAs(String clientName, String product, int qnt, int price) {
        
        String fileName = "srp_v2/order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<root>\n");
            writer.write("<client>"+clientName+"</client>\n");
            writer.write("<product>"+product+"</product>\n");
            writer.write("<quantity>"+qnt+"</quantity>\n");
            writer.write("<price>"+price+"</price>\n");
            writer.write("</root>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}