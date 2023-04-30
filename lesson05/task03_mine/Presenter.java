package task03_mine;

import java.util.Scanner;

import task03_mine.shapes.*;

public class Presenter {
    private ConsoleView view;
    private Model model;
    private Scanner sc;

    public Presenter(ConsoleView view){
        this.view = view;
        this.sc = new Scanner(System.in);
        this.model = new Model();
    }

    public void setShape() {
        ShapeList.printListOfShapes();
        int choice = view.getSelection(sc, "Выберите фигуру");
        ShapeAbs shape = ShapeList.getShape(choice);
        model.setShape(shape);
    }

    public void setParameters() {
        model.setParameters(sc);
    }

    public void getArea() {
        Double area = model.getArea();
        view.print(String.format("Площадь: %.2f", area));
    }
}
