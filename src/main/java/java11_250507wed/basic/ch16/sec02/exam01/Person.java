package main.java.java11_250507wed.basic.ch16.sec02.exam01;

public class Person {
    public void action(Workable workable) { // 인터페이스를 매개변수로 받아와서 인터페이스 함수를 사용하는 메소드
        workable.work();
    }
}
