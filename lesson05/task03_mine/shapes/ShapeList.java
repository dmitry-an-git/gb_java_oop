package task03_mine.shapes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeList implements Iterable<ShapeAbs> {

    public static List<ShapeAbs> shapeList;

    static {
        shapeList = new ArrayList<>();
        shapeList.add(new ShapeCircus());
        shapeList.add(new ShapeTriangleSides());
    }

    @Override
    public Iterator<ShapeAbs> iterator() {
        return shapeList.iterator();
    }

    public static void printListOfShapes(){
        for (ShapeAbs shape : shapeList) {
            System.out.printf("%d - %s\n", shapeList.indexOf(shape), shape.getName());
    
        };
    }

    public static ShapeAbs getShape(int index) {
        return shapeList.get(index);
    }
    
    

}
