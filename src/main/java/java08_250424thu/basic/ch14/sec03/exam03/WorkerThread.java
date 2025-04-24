package main.java.java08_250424thu.basic.ch14.sec03.exam03;

import java.awt.*;

public class WorkerThread extends Thread{ // Thread 상속
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("WorkerThread 에러");
            }
        }
    }
}
