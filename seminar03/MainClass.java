import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            animals.add(new Cat(200));
            animals.add(new Dog(500,10));
        }

        for (Animal animal : animals) {
            animal.printName();
            // System.out.println(Animal.getNumber());
            animal.run(300);
        }

        System.out.printf("количество животных %d\n",Animal.getNumber());

    }
}
