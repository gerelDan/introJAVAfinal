import Products.Laptop;
import Products.Os;
import Products.Product;

import java.util.*;

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
    public HashMap<Product, Integer> getProducts(int filterType, String filter){
        HashMap<Product, Integer> result = new HashMap<>();
        for (Product product: products.keySet()){
            if (product.getClass().getSimpleName().equals("Laptop")){
                Laptop lap = (Laptop) product;
                switch (filterType){
                    case 1: {
                        int filterint = Integer.parseInt(filter);
                        if (lap.getRamValue() >= filterint) result.put(lap, result.getOrDefault(lap, 0) + 1);
                    }
                    case 2: {
                        int filterint = Integer.parseInt(filter);
                        if (lap.getHddValue() >= filterint) result.put(lap, result.getOrDefault(lap, 0) + 1);
                    }
                    case 3: {
                        if (lap.getOs().equals(filter)) result.put(lap, result.getOrDefault(lap, 0) + 1);
                    }
                    case 4: {
                        if (lap.getColor().equals(filter)) result.put(lap, result.getOrDefault(lap, 0) + 1);
                    }
                    case 5: {
                        if (lap.getCpu().equals(filter)) result.put(lap, result.getOrDefault(lap, 0) + 1);
                    }
                        }
            }
        }

        return result;
    }

}
