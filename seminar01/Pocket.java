import java.util.ArrayList;
import java.util.List;

/**
 * Карман
 */
public class Pocket {
    private List<Product> pocket;
    
    {
        pocket = new ArrayList<Product>();
    }

    public void putToPocket(Product product){
        if (product == null) {
            return;
        }
        this.pocket.add(product);
    }

    public void tellValue(){
        double value = 0;
        for (Product product : pocket) {
            value += product.getPrice();
        }
        System.out.println(String.format("В кармане продукции на: %.2f", value));
    }
        
    
}
