package task03_mine.shapes;

public class ShapeTriangleSides extends ShapeAbs{
    
    public Double perimeter;
    
    {
        name = "Треугольник 3 стороны";
        parameters = new Double[3]; // 3 sides
        parametersName = new String[]{"Сторона 1", "Сторона 2", "Сторона 3"};

    }

    public boolean isValid(Double a, Double b, Double c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public void setParameters(Double[] parameters){
        if (isValid(parameters[0], parameters[1], parameters[2])) {
            this.parameters = parameters;
            this.perimeter = parameters[0] + parameters[1] + parameters[2];
        } else {
            System.out.println("Wrong parameters");
        }
    }

    public void calculateArea() {
        double hp = perimeter/2;
        area = Math.sqrt(hp*(hp-parameters[0])*(hp-parameters[1])*(hp-parameters[2]));
    }


}
