package Arrays클래스;
// 배열과 관련된 다양한 메서드를 제공하는 클래스
//

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysClassEx {
    public static void main(String[] args) {
        //sortAndSearchFunc();
        sortComparatorFunc();
        Integer[] array = {5, 4, 7, 9, 13, 3, 1, 88, 23};
        List<Integer> list = Arrays.asList(array);
    }
    // 정렬과 검색
    static void sortAndSearchFunc() {
        Integer[] array = {5, 4, 7, 9, 13, 3, 1, 88, 23};
        //Arrays.sort(array); // 해당 값을 오름차순으로 정렬
        Arrays.sort(array, Collections.reverseOrder());
        for (int e : array) System.out.print(e + " ");
        System.out.println();
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array,3));
        // 오름차순에서만 가능
    }
    // 정렬 오버라이딩 : 상속받은 매서드를 재정의 하는것
    // 과일 이름을 정렬하는 길이가 짧은 순으로 정렬하고 길이가 같은 경우 사전순 정렬 해주세요
    // Comparator 클래스에 compare 메서드를 오버라이딩해서 정렬 조건을 만듦
    static void sortComparatorFunc() {
        Integer[] array = {5, 4, 7, 9, 13, 3, 1, 88, 23};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;  // 양수를 반환하면 정렬을 시행
                return -1;  // 음수는 정렬조건 x
            }
        });

        for (int e : array) System.out.print(e + " ");
    }

}
