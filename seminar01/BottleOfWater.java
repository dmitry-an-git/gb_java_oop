
public class BottleOfWater extends Product {

    private int volume;

    public int getVolume() {
        return volume;
    }

    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
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
