package main.java.java12_250508thu.basic.ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(); // Product 클래스 타입의 List 컬렉션 생성. List 인터페이스 타입으로 ArrayList 인스턴스를 생성하여 사용.

        for (int i = 1; i <=  5; i++) {
            Product product = new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random())); // 생성자를 호출해서 초기값을 넣고 객체를 생성함
            list.add(product); // list에 product를 추가
        }

        // 1. 스트림 만들기
        Stream<Product> stream = list.stream(); // List인 list를 스트림 타입으로 만들기

        // 2. toString으로 list에 담긴 Product 출력하기
        // Product에 toString을 정의해와서 print할때 String으로 출력 가능 -> toString이 없다면, 주소가 출력된다.
        stream.forEach(p -> System.out.println(p)); // 하나씩 돌면서 출력하기
    }
}
