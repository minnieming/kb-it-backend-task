package main.java.java04_250421mon.basic.ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone", "white");

        System.out.println("핸드폰 모델은 : " + smartPhone.model);
        System.out.println("핸드폰 색은 : " + smartPhone.color);
    }
}
