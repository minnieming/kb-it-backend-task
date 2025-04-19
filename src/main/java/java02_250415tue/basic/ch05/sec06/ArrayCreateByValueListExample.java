package main.java.java02_250415tue.basic.ch05.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
        for (int i = 0; i<season.length; i++) {
            System.out.println("season[" + i + "] : " + season[i]);
        }

        int[] scores = { 83, 90, 87 };
        double score = 0;
        for (int i = 0; i<scores.length; i++) {
            score += scores[i];
        }
        System.out.println("총합 : " + (int)score);
        System.out.println("평균 : " + score/scores.length);
    }
}
