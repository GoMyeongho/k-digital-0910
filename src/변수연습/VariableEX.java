package 변수연습;
// 변수란 값을 저장할 수 있는 메모리 공간에 이름을 붙여 놓은 것
// 자바는 JVM이 미리 운영체제로 부터 메모리를 확보받고 재할당 해주는 개념
// 자바는 데이터형이 존재하기 때문에 사용 목적에 맞ㄴㄴ 데이터 타입을 선언해야 함
// 특수문자 중 _ $ 사용가능
// 키워드 안됨, 숫자가 앞에 오면 안됨, 공백 안됨
// camel 표기법 사용, 파이썬은 snake
// 변수 이름은 사용 목적에 맞게 지어야 함

public class VariableEX {
    public static void main(String[] args) {

        /*
        //변수 선언만 하는 경우
        int age;
        String name;
        char gender;
        double avg;
        */


        //변수 선언과 동시에 값을 할당하는 경우
        double avg = 23.99;
        int age = 23;
        String name = "고명호";
        //System.out.println(avg);

        // 변수의 사용 범위 : 자바는 Block{} Scope 언어임
        int n = 20;
        {
            // int n 외부선언은 내부에서 다시 선언할 수 없음
            int m = 30;
            System.out.println(n + m);
        }
        // System.out.println(n + m); Block Scope기 때문에 Block 안의 값(m)은 }을 만나면 소멸한다
        int m = 30;     // 소멸된 후에는 다시 선언할 수 있음
        byte num1 = 127;
        byte num2 = -128;
        num1++;
        num2--;
        System.out.println(num1);       // overflow : 가능한 값을 넘어선 값을 넣었을 때 의미없는 값이 나오는 것
        System.out.println(num2);

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);
        char ch2 = 66;
        System.out.println(ch2);

        float pi = 3.141592f;
        double pie = 3.141592;

        double num10 = 0.0;
        for (int i =0; i < 1000; i++) {
            num10 +=0.1;
        }
        System.out.println(num10);      //근사치 계산법에 의해 정확한 값이 안나옴



    }
}
