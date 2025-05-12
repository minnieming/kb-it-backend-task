package main.java.java11_250507wed.collection.basic.ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(); // HashSet은 Set 인터페이스를 implements한 글래스이다. -> Hashset 컬렉션 객체를 생성해서 Set 타입의 변수에 담았다.(다형성)
        // HashSet이 아닌 Set의 메서드까지만 접근이 가능하고 그 메서드를 실제로 동작실킬 구현체는 HashSet이다.

        // String인 set에 하나씩 값을 넣기
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java"); // set은 중복을 허용하지 않기 때문에 이 부분은 들어가지 않는다.
        set.add("iBATIS");

        int size = set.size(); // .size() 메서드 : 저장되어 ㅣㅇㅆ는 전체 객체 '수'를 리턴하는 것
        System.out.println("총 객체 수: " + size); // "JAVA"가 빠졌으므로 총 객체 수는 4이다.
    }
}
