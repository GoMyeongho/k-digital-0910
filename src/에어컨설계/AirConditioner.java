package 에어컨설계;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Thread.sleep;
import static 집주소.Address.sc;

public class AirConditioner {
    final static String[] windStrength = {"", "1단계", "2단계", "3단계"};
    final static int[] period = {0, 60, 30, 20};
    final static int[] monthTmp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 1};

    protected boolean isPower;
    protected int setTemp;
    protected int curTemp;
    protected boolean isCooler;
    protected boolean isHeater;
    protected int wind;
    Scanner sc = new Scanner(System.in);

    //생성자에서 인스턴스의 초기값을 부여, 현재 온도를 가져오기 위해 Calender class 사용
    public AirConditioner() {
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);    // 배열의 인덱스와 동일
        curTemp = monthTmp[month];
        isPower = false;
        setTemp = 24;
        isCooler = false;
        isHeater = false;
        wind = 1;
    }
    public static String bool2Str(boolean on){
        return (on) ? "ON" : "OFF";
    }

    // 몬솔 화면에 현재 에어컨 정보 출력하기
    // 온도가 바뀔 때 화면에 출력되도록 구현
    public void airConInfo(){


        System.out.println("======== 에어컨 정보 =========");
        System.out.println("전원 : " + bool2Str(isPower));
        System.out.println("현재 온도 : " + curTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 동작 : " + bool2Str(isHeater));
        System.out.println("쿨러 동작 : " + bool2Str(isCooler));
        System.out.println("바람 세기 : " + windStrength[wind]);

    }
    public void setAirConState() {
        System.out.println("현재 온도가 " + curTemp + "도 입니다.");
        System.out.print("온도를 설정하세요 :");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 도 입니다.");
        System.out.print("바람 세기를 설정 하세요 : ");
        wind = sc.nextInt();

        if (curTemp > setTemp) {
            System.out.println("Cooler가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        }
        else if (curTemp < setTemp) {
            System.out.println("Heater가 동작 합니다.");
            isCooler = false;
            isHeater = true;
        }
        else {
            isHeater = false;
            isCooler = false;
        }
    }

    public boolean isPower() {
        return isPower;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public int getCurTemp() {
        return curTemp;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public int getWind() {
        return wind;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }
    //현재온도는 현재온도에서 입력된 값의 크기 만큼 변경해서 다시 대입
    public void setCurTemp(int temp) {
        this.curTemp += temp;
    }

    public void setCooler(boolean cooler) {
        isCooler = cooler;
    }

    public void setHeater(boolean heater) {
        isHeater = heater;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }
    public void activateAirCon() throws InterruptedException {
        int elapesedTime = 0;   //경과 시간 계산
        boolean isSetTemp = false;  // 온도가 변경 될 상황인지 확인하는 조건
        System.out.print("에어컨을 켜시겠습니까?(yes / no)");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("yes")) {
            this.setPower(true);
            this.setAirConState();
            while (true) {
                sleep(1000);
                elapesedTime++;
                if (elapesedTime > AirConditioner.period[this.getWind()]) isSetTemp = true;
                if(isSetTemp) {
                    if (this.isHeater()) this.setCurTemp(1);
                    if (this.isCooler()) this.setCurTemp(-1);
                    this.airConInfo();
                    isSetTemp = false;
                    elapesedTime = 0;
                }
                if (this.getCurTemp() == this.getSetTemp()) {
                    System.out.println("설정온도가 되었습니다");
                    break;
                }
            }
        }
    }
}
class SmartAirCon extends AirConditioner {
    public SmartAirCon() {
        super();
        setTemp = 20;
    }

    @Override
    public void setAirConState() {

        if (curTemp > setTemp) {
            System.out.println("Cooler가 동작 합니다.");
            isCooler = true;
            isHeater = false;
            if(curTemp - setTemp > 8 ) wind = 3;
            else if (curTemp - setTemp > 5) wind = 2;
            else wind = 1;
        }
        else if (curTemp < setTemp) {
            System.out.println("Heater가 동작 합니다.");
            isCooler = false;
            isHeater = true;
            if(setTemp - curTemp > 8 ) wind = 3;
            else if (setTemp -curTemp > 5) wind = 2;
            else wind = 1;
        }
        else {
            isHeater = false;
            isCooler = false;
        }
    }

}
class PortableAirCon extends AirConditioner {
    protected int battery;
    public PortableAirCon() {
        super();
        battery = 100;

    }
    public boolean looseBattery() {
        if (battery > 0) {
            battery -= 1;
            System.out.println("현재 배터리가 " + battery + "% 입니다.");
            return false;
        }
        System.out.println("배터리가 부족합니다.");
        return true;
    }
    @Override
    public void activateAirCon() throws InterruptedException {
        int elapesedTime = 0;   //경과 시간 계산
        boolean isSetTemp = false;  // 온도가 변경 될 상황인지 확인하는 조건
        System.out.print("에어컨을 켜시겠습니까?(yes / no)");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("yes")) {
            this.setPower(true);
            this.setAirConState();
            while (true) {
                sleep(1000);
                elapesedTime++;
                if (elapesedTime > AirConditioner.period[this.getWind()]) isSetTemp = true;
                if (isSetTemp) {
                    if (this.isHeater()) this.setCurTemp(1);
                    if (this.isCooler()) this.setCurTemp(-1);
                    this.airConInfo();
                    isSetTemp = false;
                    elapesedTime = 0;
                }
                if (elapesedTime > 60) {
                    if (looseBattery()) {
                        System.out.println("전원이 종료됩니다.");
                        isPower = false;
                        break;
                    }
                }

                if (this.getCurTemp() == this.getSetTemp()) {
                    System.out.println("설정온도가 되었습니다");
                    break;
                }
            }
        }
    }
}