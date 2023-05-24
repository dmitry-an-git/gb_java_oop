package srp_v1.orderSaver;

import java.io.FileWriter;
import java.io.IOException;

public class SaveXML extends SaveAbsMethod {

    @Override
    public void saveAs(String clientName, String product, int qnt, int price) {
        
        String fileName = "srp_v1/order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<root>\n");
            writer.write("\t<client>"+clientName+"</client>\n");
            writer.write("\t<product>"+product+"</product>\n");
            writer.write("\t<quantity>"+qnt+"</quantity>\n");
            writer.write("\t<price>"+price+"</price>\n");
            writer.write("</root>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}