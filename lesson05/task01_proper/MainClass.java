package task01_proper;

public class MainClass {
    public static void main(String[] args) {
        Presenter p = new Presenter(new View(), new Model());
        p.run();
    }
}
