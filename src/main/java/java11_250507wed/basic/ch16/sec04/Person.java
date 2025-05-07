package main.java.java11_250507wed.basic.ch16.sec04;

public class Person {
    public void action(Calculable calculable) {
        double result = calculable.calc(10, 4); // return값을 Result에 저장
        System.out.println("결과: " + result);
    }
}


