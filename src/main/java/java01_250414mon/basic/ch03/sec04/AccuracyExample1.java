package main.java.java01_250414mon.basic.ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple - number*pieceUnit; // 1 - 7*0.1
        System.out.println("사과 1개에서 남은 양: " + result); // 근사값 때문에 오차범위가 생길 수 있다.
    }
}
