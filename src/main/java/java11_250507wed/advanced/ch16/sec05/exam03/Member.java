package main.java.java11_250507wed.advanced.ch16.sec05.exam03;

import java.security.PublicKey;

public class Member {
    private String id;
    private String name;

    public Member(String id) { // 생성자. 오버로딩
        this.id = id;
        System.out.println("Member(String id)");
    }

    public Member(String id, String name) { // 생성자. 오버로딩
        this.id = id;
        this.name = name;
        System.out.println("Member(String id, String name)");
    }

    @Override
    public String toString() { // 객체를 문자열로 표현할때 사용되는 메서드를 재정의
        String info = "{id: " + id + ",name: " + name + "}";
        return info;
    }
}
