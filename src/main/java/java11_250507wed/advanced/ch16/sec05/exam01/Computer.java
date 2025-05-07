package main.java.java11_250507wed.advanced.ch16.sec05.exam01;

public class Computer {
    public static double staticMethod(double x, double y) { // static : 객체를 만들지 않고 클래스 이름으로 직접 접근 가능
        return x + y;
    }

    public double instanceMethod(double x, double y) {
        return x * y;
    }
}
