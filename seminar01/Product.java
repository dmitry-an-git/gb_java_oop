
/**
 * Продукт
 */
public class Product {

    protected String name;
    protected String brand;
    protected double price;

    public double getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        if (name.length() < 3)
            this.name = "Продукт";
        else
            this.name = name;
    }

    public void setBrand(String brand) {
        if (brand.length() < 3)
            this.brand = "Noname";
        else
            this.brand = brand;
    }
    
    public void setPrice(double price) {
        if (price <= 0){
            throw new RuntimeException("Цена указана некорректно.");
        }
        this.price = price;
    }

    public Product(){
        this("Продукт");
    }

    public Product(String name){
        this(name, 1);
    }

    public Product(String name, double price){
        this("White label", name, price);
    }

    public Product(String brand, String name, double price){
        
        setBrand(brand);
        setName(name);
        setPrice(price);
    }

    /**
     * Получить информацию по продукту
     * @return Информация по продукту
     */
    String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
    }

    
}
