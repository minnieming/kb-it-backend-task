package main.java.java11_250507wed.collection.basic.ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        //HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();

        //Member 객체 저장
        set.add(new Member("홍길동", 30)); // .add() 메서드는 자동으로 hashCode(), equals()를 호출하게 구현되어 있어서 자동으로 계산된다.
        set.add(new Member("홍길동", 30)); // .add() 메서드 안에 중복이 아니면 HashSet에 저장, 중복이면 저장하지 않는 코드도 포함되어 있다. (중복검사 + 저장)

        //저장된 객체 수 출력
        System.out.println("총 객체 수 : " + set.size()); // 저장 되어 있는 값을 가져옴
    }
}
