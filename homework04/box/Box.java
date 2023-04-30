package box;
import java.util.ArrayList;

import fruits.*;


public class Box<T extends Fruit> {
    
    public final ArrayList<T> fruits;
    private int number; // just the number of a box

    // i want it to create fruits automatically, but it doesnt know the actual fruit due to type erasure (?)
    // 
    // private Class<T> fruitChildClass; 
    //
    // public Box(Class<T> derivedClassType){
    //     this.derivedClassType = derivedClassType;
    //     fruits = new ArrayList<T>();
    // }

    public Box(int number){
        this.number = number;
        fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    };

    public T getFruit(){
        
        if (!fruits.isEmpty()) {
            return fruits.remove(0);
        } else {
            System.out.printf("Коробка №%d пуста", number);
            return null;
        }
    };

    public double getWeight(){
        double weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight; // i dont store it as a field
    }

    @Override
    public String toString() {
        if (fruits.size()>0) {
            return String.format("В коробке №%d %s, %d шт, общий вес %.1f", number, T.getNamePlural(), fruits.size(), getWeight());
        } else {
            return String.format("Коробка №%d пуста", number);
        }
    }

    public void info() {
        System.out.println(this.toString());
    }

    public void moveFruitsTo(Box<T> anotherBox, int fruitsToMove){ // to move specific number of fruits
        for (int i = 0; i < fruitsToMove; i++) {
            anotherBox.addFruit(getFruit());
        }
    }

    public void moveFruitsTo(Box<T> anotherBox){ // to move all fruites
        moveFruitsTo(anotherBox,fruits.size());
    }
   
    public boolean compare(Box<? extends Fruit> anotherBox){
        if (this.fruits.size() == anotherBox.fruits.size()) {
            return true;
        } else {
            return false;
        }
                  
    }

}

