package main.java.java09_250429tue.basic.ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>(); // 제네릭을 String 타입으로 객체 가져오기

        box1.content = "안녕하세요.";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<Integer>();
        box2.content = 100; // 오토 언박싱
        int value = box2.content;
        System.out.println(value);
    }
}
