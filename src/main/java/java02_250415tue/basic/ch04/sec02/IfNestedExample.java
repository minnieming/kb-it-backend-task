package main.java.java02_250415tue.basic.ch04.sec02;

import java.util.Random;

public class IfNestedExample {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int score = randomNum.nextInt(20) + 81; // 0~19 까지의 값을 랜덤하게 구하고 81을 더해주면 원하는 범위 안에 들어온다.
        System.out.println("점수:" + score);

        if (score>=81 & score<=84) {
            String grade = "B";
            System.out.println("학점:" + grade);
        } else if (score>=85 & score<=89) {
            String grade = "B+";
            System.out.println("학점:" + grade);
        } else if (score>=90 & score<=94) {
            String grade = "A";
            System.out.println("학점:" + grade);
        } else if (score>=95 & score<=100) {
            String grade = "A+";
            System.out.println("학점:" + grade);
        }
    }
}
