package 객체를배열로관리;

import java.util.Scanner;

public class ObjectArrayEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : "); //배열은 크기를 지정해야 함
        int n = sc.nextInt();
        NameCard[] nameCards = new  NameCard[n];    // NameCard 클래스(참조타입) 타입의 배열 생성

        System.out.println("정보 입력");
        System.out.println("-".repeat(20));
        for (int i = 0; i < n; i++) {
            nameCards[i] = new NameCard();      // 해당하는 배열의 인덱스에 생성된 객체의 주소를 대입
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());    // 매개변수의 값을 스캐널흘 통해 입력받음
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCards[i].setEmail(sc.next());
            System.out.print("전화번호 : ");
            nameCards[i].setPhone(sc.next());
            System.out.println("-".repeat(20));
        }
        for (NameCard e : nameCards) e.printInfo();

    }
}
