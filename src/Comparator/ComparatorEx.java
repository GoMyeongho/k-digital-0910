package Comparator;

import java.util.TreeSet;

// Comparator : 정렬을 구현하는 인터페이스, 2개의 객체를 비교할 때 사용
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitsCompare().reversed());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        treeSet.add(new Fruit("자몽", 3000));
        for (Fruit fruit : treeSet) System.out.println(fruit);
    }
}

