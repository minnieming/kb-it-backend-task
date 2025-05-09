package main.java.java12_250508thu.basic.ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"}; // String 배열(Array) 만들고 값 넣어주기
        // 1. 스트림으로 만들기
        Stream<String> stringStream = Arrays.stream(strArray);
        // 2. 출력하기
        stringStream.forEach(p -> System.out.print(p + ","));

        System.out.println(" ");

        int[] intArray = {1,2,3,4,5};
        // 1. 스트림으로 만들기
        IntStream intStream = Arrays.stream(intArray);
        // 2. 출력하기
        intStream.forEach(p -> System.out.print(p + ","));

    }
}
