package srp_v1;

import srp_v1.productSaver.*;

/**
 * Program
 * spr_v1 - we are doing purely SRP here, a separate class just to save the product
 * spr_v2 - without an intermediary class, the product can save and accepts the save method directly
 */

public class Program {

    public static void main(String[] args) {
    
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();

        ProductSaver ps = new ProductSaver(order);
        ps.save(new SaveJSON());
        ps.save(new SaveXML());

    }

}