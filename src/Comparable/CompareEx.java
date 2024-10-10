package Comparable;
// Comparable 과 Comparator 는 자바에서 객체를 정렬하는데 사용하는 인터페이스
// Comparable : 나와 다른 객체를 비교하는 방식
// Comparator : 두개의 다른 객체를 비교 해줌

import java.util.TreeSet;

public class CompareEx {
    public static void main(String[] args) {
        TreeSet<Car> ts = new TreeSet<>();
        ts.add(new Car("Santafe",2023,"White"));
        ts.add(new Car("Sorento",2005,"Gray"));
        ts.add(new Car("Grandeur",2018,"Black"));
        ts.add(new Car("Morning",2023,"Red"));
        ts.add(new Car("Morning",2023,"Gray"));

        for (Car e : ts) System.out.println("이름 : " + e.getName() + " : " + e.getYear());
    }
}

