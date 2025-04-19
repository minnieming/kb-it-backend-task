package main.java.java02_250415tue.basic.ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;
//        int score = 93;

        // if 문
        if (score == 85) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        } else if (score == 93) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        // switch 문
        switch (score) {
            case 85:
                System.out.println("점수가 90보다 작습니다.");
                System.out.println("등급은 B입니다.");
                break;
            case 93:
                System.out.println("점수가 90보다 큽니다.");
                System.out.println("등급은 A입니다.");
                break;
        }

        // 삼항연산자
        String message = score == 85 ? "점수가 90보다 작습니다. \n등급은 B입니다." : "false 85"; // String으로 해서 print로 찍음.
//        String message2 = score == 93 ? "점수가 90보다 큽니다. \n등급은 A입니다." : "false 93";

        System.out.println(message);
//        System.out.println(message2);
    }
}
