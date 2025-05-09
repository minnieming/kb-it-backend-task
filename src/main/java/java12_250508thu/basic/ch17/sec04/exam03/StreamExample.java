package main.java.java12_250508thu.basic.ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum; // static으로 변수를 선언해서 main에서 사용할 수 있게 함

    public static void main(String[] args) {
        // 1. 변수를 stream으로 변경하기
        IntStream intStream = IntStream.rangeClosed(1,100); // rangeClosed로 1이상 100이하의 값을 넣어주기
        // 2. 하나씩 더해서 프린트 하기
        int sum = intStream.sum(); // sum 함수로 모든 수를 다 더하기
        System.out.println("총합: " + sum); // 프린트하기
    }
}
