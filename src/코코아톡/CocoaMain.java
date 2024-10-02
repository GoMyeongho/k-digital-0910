package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("민지");
        cocoaTalk.writeMsg("오늘 날씨가 갑자기 쌀쌀해 졌어요. 건강하게 활동 잘 하세요~~");
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("메세지를 전송할 네트워크 : [1] WiFi  [2] 5G  [3] LTE :");
        int sel = sc.nextInt();
        switch (sel) {
            case 1: adapter = new WiFi(); break;
            case 2: adapter = new FiveG(); break;
            case 3: adapter = new Lte(); break;
            default: System.out.println("전송할 네트워크 선택이 잘못 되었습니다.");
        }
        if (adapter != null) cocoaTalk.send(adapter);

    }
}
