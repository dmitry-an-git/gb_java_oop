package task03_mine.shapes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class ShapeAbs implements Iterable<Double>{
    
    protected String name;
    protected Double[] parameters;
    protected String[] parametersName;
    protected Double area;

    public abstract void calculateArea();

    public abstract void setParameters(Double[] parameters);

    public Double[] getParameters() {
        return parameters;
    }

    public String[] getParametersName() {
        return parametersName;
    }

    public boolean isValid(){
        return false;
    }

    public Double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }



    @Override
    public Iterator<Double> iterator() {
        return new Iterator<Double>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < parameters.length;
            }

            @Override
            public Double next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return parameters[currentIndex++];
            }
        };
    }

}
