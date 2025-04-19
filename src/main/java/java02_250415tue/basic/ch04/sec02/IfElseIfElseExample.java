package main.java.java02_250415tue.basic.ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {

        int score = 75;

        if (score >= 0 & score <= 69) { // 둘다 확인해야하므로 &를 사용해봤다.
            System.out.println("점수가 0~69입니다.");
            System.out.println("등급은 D입니다.");
        } else if (score >= 70 & score <= 79) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        } else if (score >= 90 & score <= 89) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score >= 90 & score <= 100) {
            System.out.println("점수가 90~100입니다.");
            System.out.println("등급은 A입니다.");
        } else {
            System.out.println("범위에서 벗어났습니다. 값을 다시 확인해주세요.");
        }
    }
}
