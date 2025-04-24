package main.java.java08_250424thu.basic.ch14.sec03.exam02;

import java.awt.*;

public class Task implements Runnable{ // Runnableㅇㅡㄴ 스레드가 작업을 실행할 때 사용하는 인터페이스
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Task에서 에러가 남");
            }
        }
    }
}
