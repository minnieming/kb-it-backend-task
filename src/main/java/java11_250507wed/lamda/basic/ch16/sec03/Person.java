package main.java.java11_250507wed.lamda.basic.ch16.sec03;

import java.security.PublicKey;

public class Person {
    public void action1 (Workable workable) {
        workable.work("홍길동", "프로그래밍");
    }

    public void action2 (Speakable speakable) {
        speakable.speak("안녕하세요");
    }
}
