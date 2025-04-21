package main.java.java04_250421mon.basic.ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane(); // SupersonicAirplane 선언해서 사용할 수 있게 준비하기
        sa.takeOff(); // "이륙합니다."
        sa.fly(); // "일반 비행합니다."
        sa.flyMode = SupersonicAirplane.SUPERSONIC; // flymode = normal -> supersonic(2)으로 변경
        sa.fly(); // "초음속 비행합니다."
        sa.flyMode = SupersonicAirplane.NORMAL; // flymode = supersonic -> normal(1)로 변경
        sa.fly(); // "일반 비행합니다."
        sa.land(); // "착륙합니다"
    }
}
