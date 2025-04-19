package main.java.java02_250415tue.basic.ch04.sec02;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {

        // Math.random()
        int num = (int) (Math.random() * 6) + 1;

        // random 클래스
//        Random number = new Random();
//        int num = number.nextInt(6) +1;


        if (num == 1) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println(num + "번이 나왔습니다.");
        } else if (num == 6) {
            System.out.println(num + "번이 나왔습니다.");
        }
    }
}
