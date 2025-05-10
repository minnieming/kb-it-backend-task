package main.java.java12_250508thu.advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("this is java");
        list1.add("i am a best developer");

        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" "))) // flatmap을 사용해서 하나 -> 여러개의 요소로 변환 -> 새로운 스트림 리턴 (Split()의 결과는 배열이기 때문에 ARraysList로 반환한다)
                .forEach(i -> System.out.println(i));

        System.out.println(" ");

        List<String> list2 = Arrays.asList("10, 20, 30, 40, 50");
        list2.stream()
                .flatMapToInt(data -> Arrays.stream(data.split(", ")) // list2.stream()이 String이기 때문에 Arrays.stream()으로 반환하면 String 타입으로 반환이 된다 (Split도 string타입 메서드)
                        .mapToInt(Integer::parseInt)) // 그래서 반환된것을 mapToInt를 통해 int로 변환해준다.
                .forEach(i -> System.out.println(i));
    }
}
