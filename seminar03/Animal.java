/**
 * Animal
 */
public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected static int number;

    {
        number ++;
    }

    public Animal(String name, int maxRun, int maxSwim){
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        
    }

    public void run(int distance){
        if (maxRun >= distance) {
            System.out.println(String.format("%s пробежал %d", name, distance));
        } else {
            System.out.println(String.format("%s не пробежал %d", name, distance));
        }
    }

    public void swim(int distance){
        if (maxSwim >= distance) {
            System.out.println(String.format("%s проплыл %d", name, distance));
        } else {
            System.out.println(String.format("%s не проплыл %d", name, distance));
        }
    }

    public void printName(){
        System.out.println(this.name);
    }
    
    public static int getNumber(){
        return Animal.number;
    }
        
}