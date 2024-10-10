package Products;

import java.util.Objects;

public abstract class Product {
    double price;
    String name;
    String manufacturer;
    static long ID = 1;
    static long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 &&
                Objects.equals(manufacturer, product.manufacturer) &&
                Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, manufacturer, id);
    }
}
