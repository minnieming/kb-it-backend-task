package main.java.java02_250415tue.basic.ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = { 95, 71, 84, 93, 87 };
        int sum = 0;

        for (int n : scores) {
            sum += n;
        }

        System.out.println("총합 : " + sum);
        System.out.println("평균 점수 : " + sum/scores.length);
    }
}
