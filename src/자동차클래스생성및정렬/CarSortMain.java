package 자동차클래스생성및정렬;

import java.util.*;

public class CarSortMain {
    static Scanner sc = new Scanner(System.in);
    static List<Car> cars = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("자동차의 이름을 입력하시오 : ");
            String name = sc.next();
            System.out.print("자동차의 년식을 입력하시오 : ");
            int year = sc.nextInt();
            System.out.print("자동차의 가격을 입력하시오 : ");
            int price = sc.nextInt();
            cars.add(new Car(year, name, price));
        }
        System.out.println("정렬 방식을 선택하시오");
        System.out.println("연식 : [1] 오름차순  [2] 내림차순");
        Car.yearUpper =
        System.out.println("이름 : [1] 오름차순  [2] 내림차순");
        System.out.println("가격 : [1] 오름차순  [2] 내림차순");
    }
}
