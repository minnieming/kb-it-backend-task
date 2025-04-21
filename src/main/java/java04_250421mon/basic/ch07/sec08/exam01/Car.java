package main.java.java04_250421mon.basic.ch07.sec08.exam01;

public class Car {
    public Tire tire; // 객체 생성 X == 사용할 수 X
    // -> Tire 타입의 참조변수를 선언 (Tire 객체를 담을 수 있는 빈 상자를 만들어 놓은 것.
    public void run() {
        tire.roll();
    }
}
