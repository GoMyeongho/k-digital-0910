package 자동차클래스생성및정렬;

import java.util.Comparator;


public class Car  {
    private int year;
    private String name;
    private int price;
    public static int yearUpper = 1;
    public static int nameUpper = 1;
    public static int priceUpper = 1;



    public Car(int year, String name, int price) {
        this.year = year;
        this.name = name;
        this.price = price;

    }

    public static void setYearUpper(boolean isUpper) {
        yearUpper = (isUpper) ? 1 : -1;
    }

    public static void setNameUpper(boolean isUpper) {
        Car.nameUpper = (isUpper) ? 1 : -1;
    }

    public static void setPriceUpper(boolean isUpper) {
        Car.priceUpper = (isUpper) ? 1 : -1;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int getYearUpper() {
        return yearUpper;
    }

    public static int getNameUpper() {
        return nameUpper;
    }

    public static int getPriceUpper() {
        return priceUpper;
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
class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (o1.getYear() != o2.getYear()) ? (o1.getYear() - o2.getYear()) * Car.yearUpper :
                (!o1.getName().equals(o2.getName())) ? o1.getName().compareTo(o2.getName()) * Car.nameUpper
                : (o1.getPrice() - o2.getPrice()) * Car.priceUpper;

    }
}
