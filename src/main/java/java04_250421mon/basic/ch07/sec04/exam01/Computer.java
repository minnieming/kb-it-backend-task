package main.java.java04_250421mon.basic.ch07.sec04.exam01;

import java.sql.SQLOutput;

public class Computer extends Calculator{

    // Calculator에 매개변수 있는 생성자가 없기 때문에 기본 생성자가 자동으로 생긴다.

    @Override // 오버라이딩 어노테이션 꼭 넣기!! (없어도 동작은 되지만, 있어야 좋은점이 훨씬 많다!)
    public double areaCircle (double r) {
        System.out.println("Calculator에서 3.14159를 Math.PI로 교체");
        return Math.PI * r * r;
    }
}
