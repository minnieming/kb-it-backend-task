package main.java.java12_250508thu.basic.ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // 스트림으로 만든것. 하지만 여기서는 여러번 사용해야 하기 때문에 변수에 넣지 않고 바로 사용.
//        IntStream intStream = Arrays.stream(arr);

        // 2의 배수 카운팅
        long count = Arrays.stream(arr).filter(p -> p % 2 == 0).count();
        System.out.println("2의 배수 개수: " + count); // count, forEach 같은 집계 (터미널 연산)은 stream 하나에 한번만 쓸 수 있어서 한번에 사용할 수 앖어서 따로 빼준것

        // 2의 배수 총합
        int sum = Arrays.stream(arr).filter(p -> p% 2 == 0).sum();
        System.out.println("2의 배수의 합: " + sum);

        // 2의 배수 평균
        double avg = Arrays.stream(arr).filter(p -> p % 2 == 0).average().getAsDouble(); // 일부러 getAsDouble()을 사용해봄 -> 바로 double로 값을 리턴할 수 있다.
        System.out.println("2의 배수의 평균: " + avg);

        // 2의 배수 중 최대값
        Arrays.stream(arr).filter(p -> p % 2 == 0).max().ifPresent(p -> System.out.println("최대값: " + p)); // 값이 있다면 동작하는 ifPresent를 사용해서 출력해주기. 메서드 참조(System.out::println)는 글을 같이 출력할 수 없기 때문에 람다식 사용

        // 2의 배수 중 최소값
        Arrays.stream(arr)
                .filter(p -> p % 2 == 0)
                .min()
                .ifPresent(p -> System.out.println("최소값: " + p));

        // 첫번째 3의 배수
        Arrays.stream(arr)
                .filter(p -> p % 3 == 0)
                .findFirst()
                .ifPresent(p -> System.out.println("첫번째 3의 배수: " + p));
    }
}
