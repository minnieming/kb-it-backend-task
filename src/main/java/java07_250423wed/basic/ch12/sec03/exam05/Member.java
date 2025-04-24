package main.java.java07_250423wed.basic.ch12.sec03.exam05;

import lombok.*;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 초기화 생성자
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Member {
    private String id;
    private String name;
    private int age;
}
