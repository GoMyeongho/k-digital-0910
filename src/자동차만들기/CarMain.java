package 자동차만들기;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###");
        Scanner sc = new Scanner(System.in);
        int areaSel;
        while (true) {
            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 :");
            areaSel = sc.nextInt();
            if (areaSel > 4 || areaSel < 1) {
                System.out.println("지역 입력이 잘못되었습니다.");
                continue;
            }
            break;
        }

        int passenger;
        while (true) {
            System.out.print("이동할 승객 수(1~100) 입력 :");
            passenger = sc.nextInt();
            if (passenger > 100 || passenger < 1) {
                System.out.println("승객 입력이 잘못되었습니다.");
                continue;
            }
            break;
        }

        int carSel;
        while (true) {
            System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            carSel = sc.nextInt();
            if (carSel > 3 || carSel < 1) {
                System.out.println("차량 입력이 잘못되었습니다.");
                continue;
            }
            break;
        }
        int extraSel;
        while (true) {
            System.out.print("부가기능 [1] ON / [2] OFF : ");
            extraSel = sc.nextInt();
            if (extraSel > 2 || extraSel < 1) {
                System.out.println("부가기능 입력이 잘못되었습니다.");
                continue;
            }
            break;
        }


        int weatherSel;
        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            weatherSel = sc.nextInt();
            if (weatherSel > 3 || weatherSel < 1) {
                System.out.println("날씨 입력이 잘못되었습니다.");
                continue;
            }
            break;
        }
        sc.nextLine();
        System.out.print("차량의 이름을 입력하시오 : ");
        String name = sc.nextLine();
        Car car = switch (carSel) {
            case 1 -> new SportsCar(name);
            case 2 -> new Sedan(name);
            case 3 -> new Bus(name);
            default -> null;
        };
        if (extraSel == 1) car.extraSkill();
        car.setTotalMove(passenger);
        car.setTotalOil(areaSel);
        car.totalTime(weatherSel);


        System.out.println("=====" + name + "=====");
        System.out.println("총 비용 : " + df.format(car.totalPay()));
        System.out.println("총 주유횟수 : " + car.totalRefuel());
        System.out.println("총 이동 시간 : " + car.getTotalHour() + "시간 " + car.getTotalMin() + "분");


    }
}
