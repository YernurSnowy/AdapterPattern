import Perfume_Pack.IPerfume;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<IPerfume> perfumes;

    public Basket(){
        perfumes = new ArrayList<>();
    }

    public void addPerfume(IPerfume perfume){
        perfumes.add(perfume);
    }

    public List<IPerfume> getPerfumes(){
        return perfumes;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (IPerfume perfume : perfumes){
            totalPrice += perfume.getPrice();
        }
        return totalPrice;
    }
}
