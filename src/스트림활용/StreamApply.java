package 스트림활용;

import java.util.*;

public class StreamApply {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("안유진", 21, 1000));
        customerList.add(new TravelCustomer("유나", 21, 2000));
        customerList.add(new TravelCustomer("카즈하", 21, 3000));
        customerList.add(new TravelCustomer("혜린", 18, 800));

        System.out.println("=".repeat(10) + "고객 명단 출력" + "=".repeat(10));
        customerList.stream().map(TravelCustomer::getName).forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println("=".repeat(10) + "여행 총 비용 계산" + "=".repeat(10));
        int total = customerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("총 여행 비용  : " + total);

        System.out.println("=".repeat(10) + "20세 이상 명단 출력" + "=".repeat(10));
        customerList.stream()
                .filter(e-> e.getAge() >= 20)
                .map(TravelCustomer::getName)
                .sorted()
                .forEach(e -> System.out.print(e + " "));
    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
