package task03_mine.shapes;

public class ShapeCircus extends ShapeAbs{

    {
        name = "Круг";
        parameters = new Double[1];
        parametersName = new String[]{"Радиус"};
    }

    public boolean isValid(Double radius){
        return (radius>0);
    }

    public void setParameters(Double[] parameters){
        if (isValid(parameters[0])){
            this.parameters = parameters;
        } else {
            System.out.println("wrong parameters");
        }

    }

    public void calculateArea() {
        this.area = 2 * Math.PI * parameters[0] * parameters[0];
    }
    
}
