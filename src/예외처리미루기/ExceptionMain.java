package 예외처리미루기;

import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] args) {
        IOSample ioSample = new IOSample();

        try {
            ioSample.input();
        } catch (IOException e) {
            System.out.println("호출된 메서드에서 예외처리를 하지 않았기 때문에 만든 예외처리");
        }
        ioSample.output();
    }
}
// 예외처리 미루기
class IOSample {
    private int num;

    public void input() throws IOException {    // 예외처리를 호출하는 쪽으로 미룸
        num = System.in.read(); // 아스키코드 값으로 반환
    }

    public void output() {
        System.out.println(num);
    }
}