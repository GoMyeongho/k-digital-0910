package 매서드오버로딩;
// 같은 이름의 메서드를 중복하여 정의 하는 것 (정적 바인딩)
// 매개변수의 타입이나 개수로 구분    (오버로딩의 조건)
// 다형성을 구현하는 중요 요소
// 반환값이나 접근제한자는 해당사항 없음
public class MethodOverloadingEx {
    public static void main(String[] args) {
        System.out.println(sum(10,20));                // 정수반환
        System.out.println(sum(10,20, 30));         // 정수반환
        System.out.println(sum(10,3.33, 4.55));     // 실수 반환
        System.out.println(sum("SUM : ",10, 20));   // 문자열 반환
    }
    static int sum (int x, int y) {
        return x + y;
    }
    static double sum (double ...val) {
        double sum = 0;
        for (double e:val) {
            sum += e;
        }
        return sum;
    }
    static int sum(int ...val) {
        int sum = 0;
        for (int e:val) {
            sum += e;
        }
        return sum;
    }
    static String sum(String x, int y, int z) {
        int sum = y + z;
        return x+ sum;
    }
}
