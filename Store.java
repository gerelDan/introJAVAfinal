import Products.Product;

import java.util.HashMap;
import java.util.HashSet;

public class Store {
    private HashSet<SalesMan> staff = new HashSet<>();
    private HashMap<Product, Integer> products = new HashMap<>();
//    HashMap<Products.Product, Integer> products = new HashMap<>;
//    staff =new HashSet<SalesMan>();
//    public Store(){
//        this.products =
//    }

    public void addProduct(Product product) {
        products.put(product, products.getOrDefault(product, 0) + 1);
    }
    public HashMap<Product, Integer> getProducts(){
        return this.products;
    }
}
