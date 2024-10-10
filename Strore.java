import Products.Product;

import java.util.HashMap;
import java.util.HashSet;

public class Strore {
    private HashSet<SalesMan> staff;
    private HashMap<Product, Integer> products;
//    HashMap<Products.Product, Integer> products = new HashMap<>;
//    staff =new HashSet<SalesMan>();

    public void addProduct(Product product){
        products.put(product, products.getOrDefault(product, 0)+1);
    }
}
