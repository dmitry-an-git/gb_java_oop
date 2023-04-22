import java.util.Random;

public class Plate {

    private int food;
    private static Random r;

    static {
        Plate.r = new Random();
    }

    public Plate() {
        this(Plate.r.nextInt(50,500));
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            System.out.println("Еда не может быть отрицательной");
        }
    }

    public void addFood(int newFood) {
        this.setFood(this.getFood() + newFood);
    }
}