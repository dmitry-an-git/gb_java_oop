package fruits;

public class Apple extends Fruit{
    
    {
        nameSingular = "яблоко";
        namePlural = "яблоки";
        mean = 0.5; // average weight
        stDev = 0.1; // to make it fuzzy
    }

    public Apple() {
        super(0);
        weight = Math.abs(mean+r.nextGaussian()*stDev);  // normal distribution but without negative cases if any
    }

    public Apple(int weight) {
        super(weight);
    }

}