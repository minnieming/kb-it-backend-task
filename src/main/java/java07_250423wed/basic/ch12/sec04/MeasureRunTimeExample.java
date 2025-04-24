package main.java.java07_250423wed.basic.ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); // 시작 시간
        int sum = 0;

        for (int i=1; i<=1000000; i++) {
            sum += i;
        }

        long endTime = System.nanoTime(); // 끝난 시간

        System.out.println("계산 결과 : " + sum);
        System.out.println("계산에 소요된 시간 (nano) : " + (endTime - startTime)); // 걸린 시갅
    }
}
