package 에어컨설계;

import static 집주소.Address.sc;

public class AirConditionerMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.print("[1] 일반 에어컨  [2] 스마트 에어컨  [3] 포터블 에어컨 \n 에어컨을 고르시오 : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1:
                    AirConditioner lgAirCon = new AirConditioner();
                    lgAirCon.activateAirCon();
                    break;
                case 2:
                    SmartAirCon lgSmartAirCon = new SmartAirCon();
                    lgSmartAirCon.activateAirCon();
                    break;
                case 3:
                    PortableAirCon lgPortableAirCon = new PortableAirCon();
                    lgPortableAirCon.activateAirCon();
                    break;
                default:
                    System.out.println("잘못된 입력입니다"); continue;
            }break;
        }

    }
}
