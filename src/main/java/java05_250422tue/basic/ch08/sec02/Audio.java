package main.java.java05_250422tue.basic.ch08.sec02;

public class Audio implements RemoteControl{ // 인터페이스의 구현체
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
}
