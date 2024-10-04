package 다중인터페이스;

public class SportCar extends Car implements AirCon, AutoDrive{
    private boolean isAirCon;   // AirCon ON / OFF\
    private int setTemp;
    private boolean isAutoDrv;
    private boolean isTurbo;

    public SportCar(boolean isAirCon, int setTemp, boolean isAutoDrv, boolean isTurbo) {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.isTurbo = isTurbo;

    }

    @Override
    public void airConON() {
        this.isAirCon = true;
        System.out.println("에어컨을 켰습니다.");
    }

    @Override
    public void airConOFF() {
        this.isAirCon = false;
        System.out.println("에어컨을 껐습니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        setTemp = tmp;
        System.out.println("에어컨 설정 온도를 " + tmp + "로 변경 합니다.");
    }

    @Override
    public void autoDrvON() {
        isAutoDrv = true;
        System.out.println("자율 주행 모드를 켰습니다.");
    }

    @Override
    public void autoDrvOFF() {
        isAutoDrv = false;
        System.out.println("자율 주행 모드를 껐습니다.");
    }
    public void viewInfo() {
        String airConStr  = (isAirCon) ? "ON" : "OFF";
        String autoStr  = (isAutoDrv) ? "ON" : "OFF";
        String turboStr  = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("제작연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }
}
