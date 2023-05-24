package srp_v1.productSaver;

import srp_v1.Order;

public class ProductSaver {
    
    private Order order;

    public ProductSaver(Order order){
        this.order = order;
    }

    public void save(SaveAbsMethod saveMethod){
        String product = order.getProduct();
        String client = order.getClientName();
        int qnt = order.getQnt();
        int price = order.getPrice();

        saveMethod.saveAs(client, product, qnt, price);
    }

    public void setOrder(Order order) {
        this.order = order;
    }
        
}
