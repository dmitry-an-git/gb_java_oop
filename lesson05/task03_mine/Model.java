package task03_mine;

import java.util.Scanner;

import task03_mine.shapes.ShapeAbs;

public class Model {
    private ShapeAbs shape;

    public void setShape(ShapeAbs shape) {
        this.shape = shape;
    }

    public void setParameters(Scanner sc){
        Double[] parameters = new Double[shape.getParameters().length];
        for (int i = 0; i < shape.getParameters().length; i++) {
            System.out.printf("%d - %s: ", i, shape.getParametersName()[i]);
            parameters[i] = sc.nextDouble();
        }
        shape.setParameters(parameters);
    }

    public Double getArea(){
        shape.calculateArea();
        return shape.getArea();
    }
}
