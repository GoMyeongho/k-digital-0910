package 상수와_리터럴;

import java.util.Scanner;

// 상수란? 메모리에 값이 한번 지정되면 변경할 수 없음
// 자바에서는 상수 정의를 final 키워드 사용
// 상수는 관례상 모두 대문자로 선언

// Static : 프로그램이 끝날 때까지 삭제되지 않는 메모리
// Heap : 동적 할당 영역, 누군가가 메모리 해제를 해줘야한다.(자바는 JVM의 GC가 알아서 해준다)
// Stack : 매개변수나 지역변수 저장공간, 자동으로 소멸하며 초기화하지 않는다

public class ConstEx {
    public static void main(String[] args) {

//
//        final double TAX_RATE = 0.10;     // 상수 선언시 관례상 대문자로 변수 이름 선언
//        // 콘솔에서 입력 받기 위해서는 스캐너 클래스에 대한 객체를 생성해야 함
//        Scanner sc = new Scanner(System.in);
//        System.out.print("수입을 입력 하세요 : ");
//        int income = sc.nextInt();
//        System.out.printf("당신이 내야 할 세금은 %.2f",income * TAX_RATE);
        // 리터럴이란? 프로그램에서 사용하는 모든 숫자, 문자, 논리값을 의미

        // 형변환이란? 선언된 변수를 다른 타입으로 변환하는 것
        // 묵시적 형변환 : 자동 변환이라고도 하기도 함, 컴파일러가 유리한 방향으로 알아서 바꿔주는 것
        // 명시적 형변환 : 개발자가 명확한 의도를 가지고 형을 변경하는 것

        int num1 = 1, num2 = 4;
        double rst1 = num1 / num2;
        System.out.println(rst1);
        double rst2 = (double) num1 / num2;     // 컴파일러가 알아서 바꿔줌, num1은 명시적 num2는 묵시적 형변환
        System.out.println(rst2);
        System.out.println(""+ rst2 + 10); // 연산자 우선순위에 의해서 문자열로 간주 됩니다.
        System.out.println(rst2 + 10 + "10"); // 먼저 숫자형 타입이 계산되고 문자열이추가 됩니다.


    }
}
