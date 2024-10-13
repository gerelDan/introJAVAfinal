package Products;


public class Laptop extends Electronics{
    private final long id;
    private final String hddType;
    private final int hddValue;
    private final String ramType;
    private final int ramValue;
    private final String os;
    private final String color;
    private final double diagonal;
    private final String cpu;


    public Laptop(String hddType, int valueHdd, String ramType,
                  int ramValue, String os, String manufacturer,
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
        return  "id=" + id +
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
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public int getRamValue() {
        return ramValue;
    }

    public int getHddValue() {
        return hddValue;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }
}
