package srp_v1.productSaver;

import java.io.FileWriter;
import java.io.IOException;

public class SaveJSON extends SaveAbsMethod {

    @Override
    public void saveAs(String clientName, String product, int qnt, int price) {

        String fileName = "srp_v1/order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
