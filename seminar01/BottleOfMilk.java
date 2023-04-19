
public class BottleOfMilk extends Product {

    private int volume;
    private int fat;

    public int getVolume() {
        return volume;
    }

    public BottleOfMilk(String name, double price, int volume, int fat){
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - объем: %d", super.displayInfo(), volume);
    }

    @Override
    public String toString() {
        return displayInfo();
    }
}
