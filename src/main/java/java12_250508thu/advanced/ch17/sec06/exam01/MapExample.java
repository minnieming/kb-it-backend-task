package main.java.java12_250508thu.advanced.ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));

        studentList.stream()
                .mapToInt(Student::getScore)
                .forEach(System.out::println);
    }
}
