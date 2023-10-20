package Certificate_Pack;

public class Certificate implements ICertificate {
    private String name;
    private double price;

    public Certificate(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
