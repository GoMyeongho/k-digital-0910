package 예외처리기본;
// 프로그램에서 오류가 발생하는 경우는 크게 두가지
// 1. 컴파일 오류 : 문법을 잘못 작성한 경우
// 2. 런타임 오류 : 실행중에 오류가 발생하는 경우
// 컴파일 타임의 오류와 런타임에 오류의 경우는 컴파일 타임에 발생하는 것이 훨씬 바람직

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        //arrayExceptionFunc();
        //fileNotFoundFunc();
        //nullPointerFunc();
        //arithmeticFunc();
    }
    static void arrayExceptionFunc() {
        try{
            int[] arr = new int[5];
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        }catch (Exception e) {  // Exception 은 모든 예외를 다 잡음
            System.out.println(e +"\n인덱스가 배열의 범위를 벗어났습니다.");
        }
        System.out.println("프로그램 정상 종료");
    }
    static void fileNotFoundFunc() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e + " 예외 발생");
        }
    }
    static void nullPointerFunc() { //
            Test test = null;
            if (test != null) System.out.println(test.name);
            else System.out.println("test 객체가 없습니다");
    }
    static void arithmeticFunc() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫번째 값 입력 : ");
            int a = sc.nextInt();
            System.out.print("두번째 값 입력 : ");
            int b = sc.nextInt();
            int rst = a / b;
            System.out.println(rst);
        } catch (ArithmeticException e ) {
            System.out.println(e + " 0으로 나눌 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println(e + " 문자로 연산할 수 없습니다.");
        } finally {
            System.out.println("무조건 수행되는 부분입니다.");
        }

    }
}



// NullPointerException : 참조해야하는 객체의 값이 존재하지 않을때 나타나는 예외
class Test {
    String name = "민지";
}
