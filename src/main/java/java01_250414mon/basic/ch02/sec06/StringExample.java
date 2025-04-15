package main.java.java01_250414mon.basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) { // 이스케이프 문자
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String java = "나는 \"자바\"를 배웁니다."; // 그냥 ""을 텍스트 중간에 넣으면 에러가 나면서 들어가지 않는다
        System.out.println(java);

        String word = "번호 \t이름 \t직업";
        System.out.println(word);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다");
    }
}
