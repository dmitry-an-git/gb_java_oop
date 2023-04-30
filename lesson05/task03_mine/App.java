package task03_mine;

public class App {
    public static void buttonClick(){
        System.out.print("\033[H\033[J");
        ConsoleView view = new ConsoleView();
        Presenter p = new Presenter(view);
        
        p.setShape();
        p.setParameters();
        p.getArea();

    }

}
