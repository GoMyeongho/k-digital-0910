package 자동차만들기;

public abstract class Car {
    protected int speed;
    protected int fuelEff;
    protected int tank;
    protected int seatNum;
    protected String name;

    final static double[] weather = {0, 1, 1.2, 1.4};
    final static int[] AREA = {0, 400, 200, 150, 300};
    final static int OILPAY = 2000;

    protected int totalMove;
    protected double totalOil;
    protected int totalHour;
    protected int totalMin;
    protected int totalDist;


    public void setTotalMove(int passenger) {
        totalMove = (passenger % seatNum == 0) ? passenger / seatNum : passenger / seatNum +1;
    }

    public void setTotalOil(int areaSel) {
        totalDist = AREA[areaSel] * totalMove;
        totalOil = (double) totalDist / fuelEff;
    }
    public int totalPay() {
        return (int) Math.ceil(totalOil * OILPAY);
    }
    public int totalRefuel() {
        return  (int) Math.ceil(totalOil / tank);
    }
    public void totalTime(int weatherSel) {
        totalDist = (int) (weather[weatherSel] * totalDist);
        totalHour = totalDist / speed;
        totalMin = (totalDist % speed) * 60 / speed;
    }
    public abstract void extraSkill();

    public int getTotalMin() {
        return totalMin;
    }

    public int getTotalHour() {
        return totalHour;
    }
}
class SportsCar extends Car{
    SportsCar(String name) {
        speed = 250;
        fuelEff = 8;
        tank = 30;
        seatNum = 2;
        this.name = name;
    }

    @Override
    public void extraSkill() {
        speed = 300;
        //speed += speed / 5;
    }
}
class Sedan extends Car {
    Sedan(String name) {
        speed = 200;
        fuelEff = 12;
        tank = 45;
        seatNum = 4;
        this.name = name;
    }
    @Override
    public void extraSkill() {
        seatNum = 5;
        // seatNum += 1;
    }
}
class Bus extends Car {
    Bus(String name){
        speed = 150;
        fuelEff = 5;
        tank = 100;
        seatNum = 20;
        this.name = name;
    }
    @Override
    public void extraSkill() {
        tank = 130;
        // tank += 30;
    }
}


