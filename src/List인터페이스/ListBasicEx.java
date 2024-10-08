package List인터페이스;
// List 인터페이스 : ArrayList, Vector, Linked List 에 상속을 주기 위한 인터페이스
// List 는 배열과 비슷한 형태의 자료 구조 (인덱스 기반), 동적으로 크기가 변함
// 요소의 저장 순서가 유지 됨
// 같은 요소의 중복 저장을 허용
// 데이터 크기가 고정되어 있지 않음
// 데이터를 다루기 위한 다양한 메서드 제공
// List 인터페이스의 구현체인 ArrayList, Vector, Linked List 의 사용 방법이 동일

import java.util.*;


public class ListBasicEx {
    public static void main(String[] args) {
        // List 인터페이스의 참조 변수로 ArrayList 생성된 객체를 참조함
        String[] fruitArr = {"Watermelon", "Peach", "Cherry"};
        // Arrays.asList() 배열을 리스트 변환하는 메서드
        List<String> fruits = new ArrayList<>(Arrays.asList(fruitArr));

        // 요소 추가, 리스트 맨뒤에 요소를 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 리스트 출력
        System.out.println("과일 목록 : " + fruits);

        // 특정 인덱스에 요소 추가
        fruits.add(1,"Grape");
        System.out.println("과일 목록 : " + fruits);

        // 요소 가져오기(인덱스 접근)
        System.out.println("과일 요소 : " + fruits.get(2));

        // 요소 제거하기
        fruits.remove(2);
        System.out.println("과일 목록 : " + fruits);

        // List 사이즈 확인
        System.out.println("과일 목록 사이즈 : " + fruits.size());

        // 요소 순회하기
        for (String e : fruits) {
            System.out.print(e + " ");
        }
        System.out.println();
        // 리스트 정렬하기
        fruits.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("과일 목록 : " + fruits);
        fruits.sort(Comparator.reverseOrder()); // 오름차순
        System.out.println("과일 목록 : " + fruits);
        fruits.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                if (o1.length() == o2.length()) return o1.compareTo(o2);
                return -1;
            }
        });
        System.out.println("과일 목록 : " + fruits);
    }
}
