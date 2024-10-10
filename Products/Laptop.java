package Products;


public class Laptop extends Electronics{
    private final long id;
    private final String hddType;
    private final int hddValue;
    private final String ramType;
    private final int ramValue;
    private final Os os;
    private final String color;
    private final double diagonal;
    private final String cpu;


    public Laptop(String hddType, int valueHdd, String ramType,
                  int ramValue, Os os, String manufacturer,
                  double price, String color, double diagonal, String cpu) {
        this.color = color;
        this.diagonal = diagonal;
        this.cpu = cpu;
        this.id = Product.ID++;
        this.hddType = hddType;
        this.hddValue = valueHdd;

        this.ramType = ramType;
        this.ramValue = ramValue;
        this.os = os;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", hddType='" + hddType + '\'' +
                ", hddValue=" + hddValue +
                ", ramType='" + ramType + '\'' +
                ", ramValue=" + ramValue +
                ", os=" + os +
                ", color='" + color + '\'' +
                ", diagonal=" + diagonal +
                ", cpu='" + cpu + '\'' +
                ", power=" + power +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
