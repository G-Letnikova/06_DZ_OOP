package DZ1;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrder {
    private Order order;

    public SaveOrder(Order order) {
        this.order = order;
    }

    public void saveToXML() {
        String fileName = "order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+"\n");
            writer.write("<order>"+"\n");
            writer.write("<clientName>"+ order.getClientName() + "<" + "/clientName>" + "\n");
            writer.write("<product>"+order.getProduct()+ "</product>"+"\n");
            writer.write("<qnt>"+order.getQnt()+ "</qnt>"+"\n");
            writer.write("<price>"+order.getPrice()+ "</price>" + "\n");
            writer.write("</order>"+"\n");
            writer.write("\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
