package 스트림;
// 스트림 : 생성, 중간 연산, 최종 연산을 하나의 스트림을 처리하는 방법
// 배열, 컬렉션 등의 자료를 일관성 있게 처리할 수 있게 해줌
// 컬렉션(또는 배열) 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 반복자 역할을 함
// 자료의 대상과 관계없이 동일한 연산을 수행
// 스트림은 컬렉션과 다르게 내부 반복자를 통해서 작업을 수행
// 필터와 맵 기반의 API 를 사용해서 지연연산을 통해서 성능 최적화
// 병렬처리 지원
//

import java.util.*;

public class StreamEx {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Arrays.asList(arr) : 배열을 List 로 변환해주는 매서드, 리스트를 생성
        List<Integer> sList = new ArrayList<>(Arrays.asList(arr));
        // 스트림 생성, 중간연산, 최종연산 : 백엔드에서 많이 사용
        sList.stream()  // 생성
                .filter(s -> s >= 5)    // 중간연산
                .forEach(s -> System.out.print(s + " "));   // 최종연산
                // .forEach(System.out::println); == .forEach(s -> System.out.println(s);
        System.out.println();

        // 스트림 사용 x
        for (int e : sList) {
            if (e >= 5) System.out.print(e + " ");

        }
    }


}
