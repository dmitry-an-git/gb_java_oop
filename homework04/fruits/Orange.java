package fruits;

public class Orange extends Fruit{
    
    {
        nameSingular = "апельсин";
        namePlural = "апельсины";
        mean = 0.3;
        stDev = 0.05; 
    }
    
    public Orange() {
        super(0);
        this.weight = Math.abs(mean+r.nextGaussian()*stDev); // normal distribution but without negative cases if any
    }
    


    public Orange(int weight) {
        super(weight);
    }

}

