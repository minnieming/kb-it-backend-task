package main.java.java02_250415tue.basic.ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String [] arr = board.split(",");

        System.out.println("번호: " + arr[0]);
        System.out.println("제목: " + arr[1]);
        System.out.println("내용: " + arr[2]);
        System.out.println("성명: " + arr[3]);
        System.out.println();

        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
