package Comparator;

import java.util.Comparator;

public class FruitsCompare implements Comparator<Fruit> {


    @Override
    public Comparator<Fruit> reversed(){
        return Comparator.super.reversed();
    }


    @Override
    public int compare(Fruit o1, Fruit o2) {
        return (o1.getPrice() == o2.getPrice()) ? o1.getName().compareTo(o2.getName()) : o2.getPrice() - o1.getPrice();
    }
}
