import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        Product bottleOfWater2 = new BottleOfWater("Вода1", 110, 2);
        Product bottleOfWater3 = new BottleOfWater("Вода2", 110, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Кобылье", 100, 2, 10);
        Product bottleOfMilk2 = new BottleOfMilk("Безлактозное", 100, 2, 3);
        Product bottleOfMilk3 = new BottleOfMilk("Соевое", 100, 2, 0);

        Product chocolate1 = new Chocolate("Сникерс", 100, 300);
        Product chocolate2 = new Chocolate("Аленка", 100, 400);
        Product chocolate3 = new Chocolate("Пальмовый", 100, 500);

        List<Product> products = new ArrayList<>();

        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        VendingMachine machine = new VendingMachine(products);
        machine.tellValue();

        Pocket pocket = new Pocket();
        pocket.tellValue();

        Wallet wallet = new Wallet();
        wallet.topUpBalance(600);
        wallet.tellBalance();

        // BottleOfWater bottleOfWaterRes1 =  machine.getBottleOfWater("Вода3", 3);
        // BottleOfWater bottleOfWaterRes2 =  machine.getBottleOfMilk("Молоко", 2);
        System.out.println("-----");
        pocket.putToPocket(machine.buyProduct(BottleOfMilk.class, wallet)); 
        System.out.println("-----");
        pocket.putToPocket(machine.buyProduct(Chocolate.class, wallet));
        System.out.println("-----");
        pocket.putToPocket(machine.buyProduct(BottleOfWater.class, wallet));
        System.out.println("-----");
        pocket.putToPocket(machine.buyProduct(BottleOfWater.class, wallet));
        System.out.println("-----");
        pocket.putToPocket(machine.buyProduct(BottleOfWater.class, wallet));
        System.out.println("-----");
        pocket.putToPocket(machine.buyProduct(BottleOfWater.class, wallet));
        System.out.println("-----");
        pocket.putToPocket(machine.buyProduct(Chocolate.class, wallet));
        System.out.println("-----");

        wallet.tellBalance();
        pocket.tellValue();
        machine.tellCash();
        machine.tellValue();
    }


}