package main.java.java05_250422tue.basic.ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc; // RemoteControl 타입의 참조변수 선언 (객체 생성 X). (인터페이스도 타입이다)
        // 인터페이스를 구현체의 공통 타입으로 쓰기 위해서 변수로 선언한다.

        rc = new Television(); // 새로운 객체 선언. television은 rc의 implements 되어 있으므로 가능
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();

    }
}
