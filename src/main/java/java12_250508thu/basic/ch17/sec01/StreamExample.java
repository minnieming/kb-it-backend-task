package main.java.java12_250508thu.basic.ch17.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // set 컬렉션 : 순서 X, 중복 X
        Set<String> set = new HashSet<String>(); // 제네릭 String 타입의 Set 컬렉션 생성. Set 인터페이스 타입으로 HashSet 인스턴스를 생성하여 사용.
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        // 1.HashSet을 set 스트림 만들기
        Stream<String> stream = set.stream();

        // 2. 최종 처리하기 : set 안에 있는걸 하나씩 꺼내서(forEach() 사용) 출력하고 싶다.
        stream.forEach(unit -> System.out.println(unit)); // 람다식으로 표현
    }
}
