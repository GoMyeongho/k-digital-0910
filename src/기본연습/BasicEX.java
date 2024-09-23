package 기본연습;
/*
    Date : 2024.09.23
    Author : 고명호


 */

public class BasicEX {
    // public은 접근 제한자, 정적 메서드, void는 반환값이 없음을 의미
    // main은 프로그램의 시작 지점, 프로그램 실행시 인자값을 받기 위한 부분
    public static void main(String[] args) {
        System.out.println("안녕하세요 자바를 시작합니다.");
        System.out.print(7);      // 정수값을 출력하고 줄바꿈 없음
        System.out.println(700); System.out.println(200);
        System.out.println("문자열을 이어서 " + "출력하기");
        System.out.println("성적 : "+ 98 + 100);      // 성적 98100 뒤의 정수를 문자열로 치환
        System.out.println(100 + 200 + "정수");   //결합 순서에 따라 계산방식이 다름
        System.out.printf("%d점\n",300);
        System.out.printf("%s\n", "경기도 수원시");
        char gender = 'M';      // 자바는 '문자'와 "문자열"은 다르다
        System.out.printf("%c\n", gender);
        String genders = "Man";
        System.out.printf("%s\n", genders);
        System.out.printf("%.2f",3.141592);

        int age = 23;
        String name = "고명호";


    }
}
