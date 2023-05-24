package srp_v1.orderSaver;

import srp_v1.Order;

public class OrderSaver {
    
    private Order order;

    public OrderSaver(Order order){
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
