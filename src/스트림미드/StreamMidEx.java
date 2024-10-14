package 스트림미드;

import java.util.*;
import java.util.stream.*;


public class StreamMidEx {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,5,4,6);

        // distinct() : 스트림에서 중복 요소를 제거함
        stream1.distinct().forEach(e->System.out.print(e + " "));
        System.out.println();

        // filter() : 스트림에서 전달된 조건이 참인 값만 골라냄
        stream2.filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();

        // 스트림 변환 : map(), flatMap()
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "REACT");
        stream.map (e -> e.length()).forEach(e->System.out.print(e + " "));
        System.out.println();

        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s -> Stream.of(s.split(" "))).forEach(s -> System.out.print(s + "/"));
        System.out.println();
        // 중개 연산 : 제한, 정렬
        IntStream stream4 = IntStream.range(0, 10); // 0에서 10미만
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);

        // skip() : 전달된 개수만큼의 요소를 제외하고 새로운 스트림 반환
        stream4.skip(4).forEach(e -> System.out.print(e + " "));
        System.out.println();

        // limit() : 전달된 개수만큼의 요소로 이루어진 새로운 스트림 반환
        stream5.limit(5).forEach(e -> System.out.print(e + " "));
        System.out.println();

        // sorted() : 정렬
        Stream<String> stream7 = Stream.of("HTML", "CSS", "JAVA", "REACT","JAVASCRIPT");
        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "REACT","JAVASCRIPT");
        stream7.sorted().forEach(e -> System.out.print(e + " "));
        System.out.println();
        stream8.sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println();
        // 길이기준 + 길이같으면 알파벳정렬
        Stream<String> stream9 = Stream.of("HTML", "CSS", "JAVA", "REACT","JAVASCRIPT");
        stream9.sorted(Comparator   // 정렬 연산자
                .comparingInt(String::length)   // 첫번째 조건
                .thenComparing(String::compareTo))  // 두번째 조건
                .forEach(e -> System.out.print(e + " "));
    }
}
