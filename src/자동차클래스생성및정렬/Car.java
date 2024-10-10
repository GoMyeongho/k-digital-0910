package 자동차클래스생성및정렬;

import java.util.Comparator;

public class Car implements Comparator<Car> {
    private int year;
    private String name;
    private int price;
    public static int yearUpper;
    public static int nameUpper;
    public static int priceUpper;

    @Override
    public int compare(Car o1, Car o2) {
        int yearDiff = o1.year - o2.year;
        int nameDiff = o1.name.compareTo(o2.name);
        if (yearDiff !=0) return (o1.year - o2.year) * yearUpper;
        else return (nameDiff != 0) ? nameDiff * nameUpper : (o1.price - o2.price) * priceUpper;

    }

    public Car(int year, String name, int price) {
        this.year = year;
        this.name = name;
        this.price = price;

    }
    @Override
    public String toString() {
        return "이름 : " + name + " : " + year + " : " + price;
    }
    /*
    public int compare(Car o1, Car o2, int yearUpper, int nameUpper, int priceUpper) {
        int yearDiff = o1.year - o2.year;
        int nameDiff = o1.name.compareTo(o2.name);
        if (yearDiff !=0) return (o1.year - o2.year) * yearUpper;
        else return (nameDiff != 0) ? nameDiff * nameUpper : (o1.price - o2.price) * priceUpper;
    }
     */
}
