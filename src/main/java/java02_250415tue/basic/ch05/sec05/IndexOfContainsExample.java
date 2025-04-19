package main.java.java02_250415tue.basic.ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int index = subject.indexOf("프로그래밍");
        System.out.println(index);

        boolean result = subject.contains("자바"); // 포함이 되어 있는지만 확인

        if (result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련된 책이 아니군요.");
        }
    }
}
