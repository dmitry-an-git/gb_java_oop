public class Cat extends Animal{

    private static final String defName = "dummy";
    private static int number;

    {
        number ++;
    }

    public Cat(int maxRun){
        super(defName, maxRun, 0);
        String name = String.format("Кот %d", Cat.number);
        this.name = name;
    }

    public Cat(String name, int maxRun){
        super(name, maxRun, 0);
    }
}
