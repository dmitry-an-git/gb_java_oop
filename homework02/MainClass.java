import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainClass {
    public static void main(String[] args) {
        // Cat cat0 = new Cat("Barsique", 5);
        // cat0.isFull();
        // cat0.setAppetite(0);
        // cat0.isFull();
        // Plate plate = new Plate(100);
        // plate.info();
        // cat0.eat(plate);
        // //plate.setFood(plate.getFood() - cat0.getAppetite());
        // cat0.isFull();
    
        List<Cat> cats = new ArrayList<Cat>();
        Plate plate = new Plate(400);

        catBreak();
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
            cats.get(i).isFull(); 
            System.out.println(cats.get(i).getNumber());
             
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