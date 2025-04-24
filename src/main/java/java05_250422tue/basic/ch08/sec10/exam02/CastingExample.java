package main.java.java05_250422tue.basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();

//        vehicle.checkFare(); // checkFare은 Vehicle에 속한 클래스가 아니기 때문에 오류가 난다.
//        Bus bus = vehicle; // vehicle이 bus보다 더 큰 개념이기 때문에 에러가 나는 것
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
