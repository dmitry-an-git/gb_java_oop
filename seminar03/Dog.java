public class Dog extends Animal{
    
    private static final String defName = "dummy";
    private static int number;

    {
        number ++;
    }

    public Dog(int maxRun, int maxSwim){
        super(defName, maxRun, maxSwim);
        String name = String.format("Пес %d", Dog.number);
        this.name = name;
    }

    public Dog(String name, int maxRun, int maxSwim){
        super(name, maxRun, maxSwim);
    }

    
}
