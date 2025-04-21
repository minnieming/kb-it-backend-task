package main.java.java04_250421mon.basic.ch07.sec03.exam02;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model, color); // 컴파일시 자동으로 호출 되어서 쓰지 않아도 된다.
    }
}
