package main.java.java04_250421mon.basic.ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
    public static final int NORMAL = 1; // 상수라서 대문자로 표시
    public static final int SUPERSONIC = 2;
    public int flyMode = NORMAL;
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}
