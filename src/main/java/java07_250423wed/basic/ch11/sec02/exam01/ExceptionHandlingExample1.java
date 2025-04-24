package main.java.java07_250423wed.basic.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");

        try {
            printLength("ThisIsJava"); // String의 길이가 10이기 때문에 10을 반환
            printLength(null); // null은 아무것도 없는것이기 때문에 길이를 반환할 수 없어서 에러가 난다. "" 이렇게 넣으면 0이 반환이 되나, null은 반환할것도 없는 무의 상태이기 때문에 에러가 난다.
        } catch (Exception e) {
            System.out.println(e.getMessage()); // 예외 객체의 메세지로 출력
            e.printStackTrace(); // 스택 추적 내용을 모두 출력
        }
        System.out.println("[프로그램 종료]");
    }
}
