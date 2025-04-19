package main.java.java02_250415tue.basic.ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int num = 1;
        int result = 0;
        while (num <= 100) {
            result += num;
            num++;
        }
        System.out.println("1~100 합 : " + result);
    }
}
