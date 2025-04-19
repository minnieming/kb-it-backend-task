package main.java.java03_250416wed.basic.ch06.sec09;

public class Car {
    String model;
    int speed;

    Car (String model) {
        this.model = model;
    }

    int getSpeed () {
        return speed;
    }

    void setSpeed (int speed) {
        this.speed = speed;
    }

    void run() {
        System.out.println(model + "가 달립니다.(시속:" + speed +"km/h)");
    }


}
