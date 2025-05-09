package main.java.java12_250508thu.basic.ch17.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // String타입의 List 인터페이스로 ArrayList 인스턴스 생성
        // 리스트에 값 넣어주기
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        // 1. 스트림으로 바꾸기
        Stream<String> stringStream = list.stream(); // 변수로 사용하기 위해서 이렇게 만듦 -> stream은 1회성이다. 연산을 하면 해당 stream은 소모되어 더 사용하지 못한다.

        // 중복 요소 제거
        stringStream.distinct().forEach(p -> System.out.println(p));
        System.out.println(" ");

        // 신으로 시작하는 요소만 필터링
        list.stream().filter(p -> p.contains("신")).forEach(System.out :: println); // println을 이렇게도 사용 가능하다!
        System.out.println(" ");

        // 중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
        list.stream().distinct().filter(p -> p.contains("신")).forEach(System.out::println);
    }
}
