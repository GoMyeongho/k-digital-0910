package 디폴트메서드;

import java.util.Scanner;

// 인터페이스 모든 문법과 디폴트 메서드에 대해서 학습
public class DefaulMeothodMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteController rc;
        System.out.println("제품 선택 :  [1] TV  [2] Audio");
        int sel = sc.nextInt();
        if (sel == 1) {
            rc = new Television();
            rc.turnON();
            rc.setVolume(20);
            RemoteController.changeBattery();
        } else {
//            rc = new Audio();
//            rc.turnON();
//            rc.setVolume(102);
            Audio audio = new Audio();
            audio.turnON();
            audio.setVolume(102);
            audio.getInfo();

        }
    }
}
