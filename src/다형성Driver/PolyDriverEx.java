package 다형성Driver;

import java.util.Scanner;

public class PolyDriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver("고명호");
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차를 선택 \n[1] 스포츠카  [2] 버스  [3] 택시 :");
        int sel = sc.nextInt();
        switch (sel) {
            case 1: driver.drive(new SportsCar()); break;
            case 2: driver.drive(new Bus()); break;
            case 3: driver.drive(new Taxi()); break;
            default: System.out.println("선택한 차량이 준비 되지 않았습니다.");
        }
    }
}


class Driver {
    String name;

    public Driver(String name) {
        this.name = name;
    }
    void drive(Vehicle v) {
        System.out.print(name + "의 ");
        v.run();
    }
}

class Vehicle {
    void run() {
        System.out.println("탈것이 달린다.");
    }
}

class SportsCar extends Vehicle {
    @Override
    void run() {
        System.out.println("스포츠카가 달린다.");
    }
}

class Bus extends Vehicle {
    @Override
    void run() {
        System.out.println("버스가 달린다.");
    }
}

class Taxi extends Vehicle {
    @Override
    void run() {
        System.out.println("택시가 달린다.");
    }
}
