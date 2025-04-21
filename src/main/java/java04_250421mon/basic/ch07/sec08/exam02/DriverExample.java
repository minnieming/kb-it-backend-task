package main.java.java04_250421mon.basic.ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus); // 부모타입인데 자식을 넣어도 되는 이유 : 다형성 때문
        // 다형성 : 부모 타입으로 메서드를 호출해도, 자식이 오버라이딩한 메서드가 실행된다.

        Taxi taxi = new Taxi();
        driver.drive(taxi);  // 같은 타입인데 실제 동작은 객체(bus, taxi)에 따라 달라진다.
    }
}
