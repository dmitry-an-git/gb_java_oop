package fruits;

import java.util.Random;

public abstract class Fruit{

    protected static double mean;
    protected static double stDev;
    protected static String namePlural;
    protected static String nameSingular;
    protected static final Random r = new Random();
    protected double weight;

    public Fruit(){
        
    };
    
    public Fruit(double weight){
        this.weight = weight;
    };

    public double getWeight() {
        return weight;
    }

    public static String getNamePlural() {
        return namePlural;
    }

    public static String getNameSingular() {
        return nameSingular;
    }

    @Override
    public String toString() {
        return String.format("%s, вес %.2f", getNameSingular(), getWeight());
    }
}
