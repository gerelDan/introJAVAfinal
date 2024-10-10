package Products;


public class Laptop extends Electronics{
    private final long id;
    private final String hddType;
    private final int hddValue;
    private final String ramType;
    private final int ramValue;
    private final Os os;


    public Laptop(String hddType, int valueHdd, String ramType, int ramValue, Os os) {
        this.id = Product.ID++;
        this.hddType = hddType;
        this.hddValue = valueHdd;

        this.ramType = ramType;
        this.ramValue = ramValue;
        this.os = os;
    }
}
