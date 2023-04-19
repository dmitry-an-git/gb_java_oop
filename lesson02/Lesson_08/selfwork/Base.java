package Lesson_08.selfwork;
// how to set random? - protected static Random r;
// why constructors public in abstract class?
// 
public abstract class Base {
    protected int first;
    protected int second;
    protected static int counter;
    {
        counter = 0;
    }
    public Base() {
        this(1);
    }
    public Base(int first){
        this(first,2);
    }
    public Base(int first, int second){
        this.first = first;
        this.second = second;
        ++counter;
    }
}
