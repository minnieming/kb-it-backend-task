package main.java.java01_250414mon.basic.ch03.sec04;

public class AccuracyExample2 {
    public static void main(String[] args) {
            int apple = 1;
            int totalPieces = apple * 10; // 1 * 10
            int number = 7;
            int result = totalPieces - number; // 10 - 7
            System.out.println("10조각에서 남은 조각: " + result);
            System.out.println("사과 1개에서 남은 양: " + result/10.0);
    }
}
