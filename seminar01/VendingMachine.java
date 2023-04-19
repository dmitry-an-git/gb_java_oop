/**
 * Автомат
 */

import java.util.List;

public class VendingMachine {

    private final List<Product> products;
    private double cash;

    {
        cash = 0;
    }

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public void depositCash(double price){
        this.cash += price;
    }

    public void tellCash(){
        System.out.println(String.format("В автомате денег: %.2f", this.cash));
    }

    public void tellValue(){
        double value = 0;
        for (Product product : products) {
            value += product.getPrice();
        }
        System.out.println(String.format("В автомате продукции на: %.2f", value));
    }

    public Product buyProduct(Class<?> cls, Wallet wallet){
        boolean present = false;
        for (Product product : products){
            if (cls.isInstance(product)) {
                present = true;
                if (wallet.flushBalance(product.getPrice())) {
                    this.depositCash(product.getPrice());
                    this.products.remove(product);
                    System.out.println("Вы купили: ");
                    System.out.println(product.displayInfo());
                    return product;
                }   
            }
        }
        if (present == true) {
            System.out.println("Недостаточно денег!");
        } else {
            System.out.println("Таких продуктов больше нет!");
        }
        return null;
    }


    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    System.out.println("Вы купили воду: ");
                    System.out.println(product.displayInfo());
                    return (BottleOfWater)product;
                }
            }
        }
        System.out.println("Такой бутылки с водой нет в автомате.");
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfMilk){
                if (product.getName() == name && ((BottleOfMilk)product).getVolume() == volume){
                    System.out.println("Вы купили молоко: ");
                    System.out.println(product.displayInfo());
                    return (BottleOfMilk)product;
                }
            }
        }
        System.out.println("Такой бутылки с молоком нет в автомате.");
        return null;
    }

    public Chocolate getChocolate(String name, int calories){

        for (Product product : products){
            if (product instanceof Chocolate){
                if (product.getName() == name && ((Chocolate)product).getCalories() == calories){
                    System.out.println("Вы купили шоколад: ");
                    System.out.println(product.displayInfo());
                    return (Chocolate)product;
                }
            }
        }
        System.out.println("Такого шоколада нет в автомате.");
        return null;
    }


}
