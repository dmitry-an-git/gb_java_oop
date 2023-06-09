import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private Boolean full; // aka hungry
    private static Random r;
    private static int number;

    static {
        r = new Random();
    }

    {
        number++; // due to some reasons it always starts with 0, not 1!
    }

    public static int getNumber() {
        return number;
    }

    public Cat() {
        this(String.format("Кот %d", getNumber()), Cat.r.nextInt(50, 100));
    }

    public Cat(String name, int appetite) {
        this.name = name;
        setAppetite(appetite);
    }

    public void setAppetite(int appetite) {
        if (appetite>0) {
            this.appetite = appetite;
            this.full = false;
        } else if (appetite == 0) {
            this.appetite = appetite;
            this.full = true;
        } else {
            System.out.println("Аппетит не может быть отрицательным!");
        }
    }
    
    public void eat(Plate plate) {
        if (plate.getFood() == 0) {
            System.out.println(String.format("%s не ест! Тарелка пустая!", this.name));
        } else if (plate.getFood() < this.getAppetite()) {
            System.out.println(String.format("%s не ест! Еды слишком мало!", this.name));
        } else {
            plate.setFood(plate.getFood() - this.getAppetite());
            this.setAppetite(0); 
            System.out.println(String.format("%s ест!", this.name));
        }
    }

    public int getAppetite() {
        return this.appetite;
    }

    public void isFull() {
        if (full) {
            System.out.println(String.format("%s сытый", this.name));
        } else {
            System.out.println(String.format("%s голодный, аппетит: %d", this.name, this.appetite));
        }
    }

    public void saySmth() {
        System.out.println(String.format("%s говорит мяу", this.name));
    }
}
