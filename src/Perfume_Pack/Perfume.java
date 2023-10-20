package Perfume_Pack;

public class Perfume implements IPerfume {
    private String name;
    private double price;

    public Perfume(String name, double price){
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
