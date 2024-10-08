package 반복자와향상된for문;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// 자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법은 Iterator 인터페이스로 표준화함
public class IteratorExMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        // 향상된 for 문 (권장되는 방식)
        for (int e : list) System.out.print(e + " ");
        System.out.println();

        // Iterator
        Iterator<Integer> iterator = list.iterator();   // 표준 Iterator 생성
        while(iterator.hasNext()){
            if (iterator.next() == 4) iterator.remove();    // 요소값을 변경할 수 있음
        }
        for (int e : list) System.out.print(e + " ");

    }
}
