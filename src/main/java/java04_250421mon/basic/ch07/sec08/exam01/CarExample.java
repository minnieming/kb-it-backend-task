package main.java.java04_250421mon.basic.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car(); // 객체. 클래스로 만든 실제 실체

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire(); // HankookTire가 자식이므로 자동 형변환
        myCar.run();

        myCar.tire = new KumhoTire(); // KumhoTire가 자식이므로 자동 형변환
        myCar.run();

    }
}
