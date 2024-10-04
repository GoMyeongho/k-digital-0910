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
    }

    @Override
    public void airConOFF() {
        this.isAirCon = false;
    }

    @Override
    public void setAirConTemp(int tmp) {

    }

    @Override
    public void autoDrvON() {

    }

    @Override
    public void autoDrvOFF() {

    }
}
