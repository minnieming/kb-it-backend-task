package main.java.java03_250416wed.basic.ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {

        Car car = new Car();

        car.setGas(10);
        car.isLeftGas();
        car.gasCheck(car.hasGas());

        car.run();
        car.gasCheck(car.hasGas());
    }
}
