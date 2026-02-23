package genericsSetMap.map;

import entidades.Product;

import java.util.HashMap;
import java.util.Map;

public class MapEX001 {
    public static void main(String[] args) {

        Map<Product,Double> cookies = new HashMap<Product,Double>();

        Product p1 = new Product("Tv",900.00);
        Product p2 = new Product("Notebook",1200.00);
        Product p3 = new Product("Tablet",400.00);

        cookies.put(p1,900.00);
        cookies.put(p2,1200.00);
        cookies.put(p3,400.00);

        Product p4 = new Product("Tv",900.0);

        System.out.println("Contains 'p4' key: "+cookies.containsKey(p4));

    }
}
