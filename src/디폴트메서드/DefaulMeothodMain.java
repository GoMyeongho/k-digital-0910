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
            rc.setMute(true);
        } else {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(102);
            rc.setMute(true);


        }
        RemoteController rc2 = new RemoteController() {
            int volume;
            @Override
            public void turnON() {
                System.out.println("PS의 전원을 켭니다.");
            }

            @Override
            public void turnOFF() {
                System.out.println("PS의 전원을 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if ( volume > RemoteController.MAX_VOLUME) {
                    this.volume = RemoteController.MAX_VOLUME;
                }
                else if (volume < RemoteController.MIN_VOLUME) {
                    this.volume = RemoteController.MIN_VOLUME;
                }
                else this.volume = volume;

            }
        };
        rc2.turnON();
        rc2.setVolume(30);
    }
}
