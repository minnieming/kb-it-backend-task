package main.java.java11_250507wed.collection.basic.ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        // set에 객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // Iterator 패턴으로 순회하며 각 요소를 출력하세요.
        Iterator<String> iterator = set.iterator(); // iterator()은 Set 인터페이스에 정의된 메서드.
        // -> Set 안에 들어있는 요소들을 하나씩 순회할 수 있는 Iterator 객체를 반환.

        // String 타입의 Iterator 인터페이스 타입의 변수 iterator를 선언한다는 뜻
        // set.iterator()는 HashSet 클래스에 구현되어 있는 메서드를 호출한 것 (이 안에 new로 구현 객체를 만들어서 리턴하는 코드가 있다)
        // -> set 안에 있는 값을 하나씩 꺼낼 수 있는 반복자를 만들어서 데이터를 하나씩 꺼내 iterator라는 변수에 저장하는 도구를 만든 것 (객체를 반환해서)

        while (iterator.hasNext()) { // .hasNext() : 가져올 객체가 있으면 true를 리턴, 없으면 false를 리턴
            String element = iterator.next(); // set(컬렉션)에서 하나의 객체를 가져온다.
            System.out.println(element); // 객체가 무엇인지 print

            if(element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        // 향상된 for 문으로 순회하며 각 요소를 출력하세요.
        set.remove("JDBC");

        for (String element : set) { // ForEach문을 사용할때는 컬렉션에서 요소를 제거할 수 없다.
            System.out.println(element);
        }
    }
}
