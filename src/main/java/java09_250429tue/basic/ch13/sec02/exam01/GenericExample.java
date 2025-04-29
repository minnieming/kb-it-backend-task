package main.java.java09_250429tue.basic.ch13.sec02.exam01;

import javax.swing.*;

public class GenericExample {
    public static void main(String[] args) {

        // product1
        Product<Tv, String> product1 = new Product<Tv, String>();

        product1.setKind(new Tv()); // 새로운 객체 생성
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind(); // = Tv tv = new Tv() 이것과 같은 의미? getKind로 가져온 값을 넣어줄 곳이 필요해서 Tv tv를 선언함
        String tvModel = product1.getModel();

        // product2
        Product<Car, String> product2 = new Product<Car, String>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
