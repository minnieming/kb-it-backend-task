package main.java.java03_250416wed.basic.ch06.sec08.exam01;

public class Calculator {

    void powerOn() { // void로 하면 값을 보내지 않고 동작만 한다.
        System.out.println("전원을 켭니다");
    }

    int plus (int x, int y) { // 이 안에서 매개변수를 받아서 계산을 하고 내보낼 수 도 있다. 함수처럼
        int result = x + y;
        return result;
    }

    double divide (double x, double y) {
        double result = x / y;
        return result;
    }

    void powerOff () {
        System.out.println("전원을 끕니다.");
    }
}
