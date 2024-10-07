package Wrapper클래스;
// Wrapper 클래스란? 기본 타입의 데이터를 객체 타입으로 취급하도록 변환해주는 클래스


public class WrapperClassEx {
    public static void main(String[] args) {
        /*
        IntegerEx integerEx = new IntegerEx();
        integerEx.x = 100;
        System.out.println(integerEx.x);
         */
        Integer x = 100;    // Auto Boxing
        int xx = x;
    }
}
/*
class IntegerEx {
    int x;
}
*/
