package main.java.java12_250508thu.basic.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        // asList()는 Arrays.asList()로 사용하면 리스트를 간편하게 초기화 하는것이다.
        // List<Student> list = new ArrayList<>();
        // list.add(newStudent("철수"));
        // 밑에 있는걸 풀어쓰면 이런식으로 쓸 수 있다. asList()로 이걸 최소화한것이다.
        List<Student> list = Arrays.asList( // 제네릭으로 Student 클래스 타입의 List 컬렉션 생성. ArrayList로 생성하는 과정에서 asList로 초기화하며 초기값을 입력
                new Student("홍길동", 10), // 클래스의 생성자로 인스턴스를 생성하며 초기화
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 1. 스트림으로 바꾸기
        Stream<Student> listStream = list.stream(); // Student 타입. arrays도 List에 속하기 때문에 list.stream으로 만들기
        // 2. 중간 처리 : 매핑 mapToInt()
        IntStream score = listStream.mapToInt(item -> item.getScore()); // Student의 필드에서 score만 빼는 작업. average()를 사용할껀데, average()는 기본형 스트림에서만 사용가능하기 때문에 변환해줘야 한다.
        // 3. 최종 처리 : 집계 average()
//        OptionalDouble avg = score.average(); // 이렇게 하면 출력 값이 OptionalDouble[20.0]로 나온다.
        double avg = score.average().getAsDouble(); // getAsDouble() : double값을 바로 꺼낼 수 있습니다 -> 리턴 타입 double 사용 가능./
        System.out.println("평균 점수: " + avg);

        // 체이닝 패턴으로 간단하게 구현
        double avg2 = list.stream()
                .mapToInt(item -> item.getScore())
                .average()
                .getAsDouble();
        System.out.println("평균 점수: " + avg2);
    }
}
