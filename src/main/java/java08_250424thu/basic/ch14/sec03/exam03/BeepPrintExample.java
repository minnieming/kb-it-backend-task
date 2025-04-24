package main.java.java08_250424thu.basic.ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        // 비프음 출력 (상속)
        Thread thread = new WorkerThread();
        thread.run();

        // 익명 객체로 출력
        Thread thread1 = new Thread(){
            @Override
            public void run(){
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
        };
        thread1.start();

        // 띵 문자열 출력
        for (int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("main에서 오류가 남");
            }
        }

    }
}
