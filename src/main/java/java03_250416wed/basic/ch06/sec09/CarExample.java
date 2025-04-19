package main.java.java03_250416wed.basic.ch06.sec09;

public class CarExample {
    public static void main(String[] args) {

        Car car = new Car("벤츠");

        car.setSpeed(80);

        int speed = car.getSpeed();

        car.run();
    }
}
