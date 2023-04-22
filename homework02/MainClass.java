import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainClass {
    public static void main(String[] args) {
        // Cat cat = new Cat("Barsique", 5);
        // Plate plate = new Plate(100);
        // plate.info();
        // cat.eat(plate);
        // //plate.setFood(plate.getFood() - cat.getAppetite());
        // cat.isFull();
    
        List<Cat> cats = new ArrayList<Cat>();
        Plate plate = new Plate(400);

        catBreak();
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
            cats.get(i).isFull(); 
        }  
        plate.info();

        catBreak();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();

        catBreak();
        for (Cat cat : cats) {
            cat.isFull();
        }

        catBreak();
        System.out.println("Докладываем еду.");
        plate.addFood(1000);
        plate.info();
    }

    public static void catBreak(){
        System.out.println("\n(^._.^)ﾉ☆( _ _).oO\n");
    }
}