package main.java.java05_250422tue.basic.ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUME = 10; // 상수. public static final은 자동으로 된다
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
