package main.java.java02_250415tue.basic.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] num = {84, 90, 96};
        int sum = 0;

        for (int n : num) {
            sum += n;
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum/num.length);
    }
}
