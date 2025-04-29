package main.java.java09_250429tue.basic.ch13.sec02.exam02;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
