package 필드와매서드;
// 필드 : 변수의 속성을 표현하는 필드
// 매서드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
// 자바는 클래스 기반의 언어 이므로 클래스 외부에 별도의 함수가 존재 할 수 없음


public class FieldAndMethodEx {
    public static void main(String[] args) {
       FieldAndMethodEx test = new FieldAndMethodEx();
       int sum = test.sum1(100,200);
       System.out.println(sum);
       System.out.println(sum(100,200));
       System.out.println(sum("Test", "Java"));
       System.out.println(sum("Test", 1234));
       System.out.println(sum(1,2,3,4,5,6,7,8,9));
    }
    // 인스턴스 메서드
    int sum1(int a, int b) {
        return a + b;
    }
    // 클래스 메서드, 매개변수의 입력이 존재, 반환값도 존재
    static int sum(int a, int b){
        return a + b;
    }
    static String sum(String a, String b) {
        return a + b;
    }
    static String sum(String a, int b) {
        return a + b;
    }
    static String sum(int a, String b) {
        return a + b;
    }
    // 매개변수의 개수를 알 수 없을 때 사용하는 방법
    static int sum(int ...val) {        // ...은 전개 연산자
        int sum = 0;
        for(int e : val) {
            sum += e;
        }
        return sum;
    }

}
class Car{
    static int productNumber = 0;                   // 클래스 필드
    static String company = "현대자동차";       // 클래스 필드
    String modelName;   //인스턴스 필드
    int speed;          //인스턴스 필드
    int horsePower;     //인스턴스 필드
    String color;       //인스턴스 필드
    // 매개변수가 있는 생성자
    Car(String name, int speed, int power, String color) {
        modelName = name;
        this.speed = speed;
        this.horsePower = power;   // == horsePower = power
        this.color = color;
        productNumber++;    // 클래스 필드
    }
}