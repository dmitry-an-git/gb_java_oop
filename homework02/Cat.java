import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private Boolean full;
    private static Random r;
    private static int number;

    static {
        r = new Random();
        number = 0;
    }

    {
        full = false;
    }

    public Cat() {
        this(String.format("Кот %d", number+1), Cat.r.nextInt(50, 100));
    }

    public Cat(String name, int appetite) {
        Cat.number += 1;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood()<this.appetite) {
            System.out.println(String.format("%s не ест! Еды слишком мало!", this.name));
        } else {
            plate.setFood(plate.getFood()-appetite);
            this.appetite = 0;
            this.full = true;
            System.out.println(String.format("%s ест!", this.name));
        }
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    
    public int getAppetite() {
        return appetite;
    }

    public void isFull() {
        if (full) {
            System.out.println(String.format("%s сытый", this.name));
        }
        else System.out.println(String.format("%s голодный, аппетит: %d", this.name, this.appetite));
        
    }

    public void saySmth() {
        System.out.println(String.format("%s говорит мяу", this.name));
    }
}
