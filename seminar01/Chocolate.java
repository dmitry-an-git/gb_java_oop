public class Chocolate extends Product {
    int calories;

    public void setCalories(int calories) {
        if (calories <= 0){
            throw new RuntimeException("Калорийность указана некорректно.");
        }
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public Chocolate(String name, int price, int calories){
        super(name,price);
        setCalories(calories);
    }

    @Override
    public String displayInfo() {
        // TODO Auto-generated method stub
        return String.format("%s - ккал: %d", super.displayInfo(), calories);
    }

    @Override
    public String toString() {
        return displayInfo();
    }
}
