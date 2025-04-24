package main.java.java08_250424thu.basic.ch14.sec03.exam02;

public class BeepPrintExample {
    public static void main(String[] args) {
        // thread interface인 runnable 사용해서 함
        Task task = new Task();
        task.run();

        // main에서 띵 문자열 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("BeepPrintExample에서 에러남");
            }
        }
    }
}
