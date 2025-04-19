package main.java.java03_250416wed.basic.ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car (){} // 다른 생성자를 만들어 놓으면 기본 생성자가 자동으로 만들어지지 않는다. 그럴땐 기본 생성자도 호출해야 한다.

    Car(String model) {
        this.model = model;
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
