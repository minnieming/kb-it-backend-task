package main.java.java07_250423wed.basic.ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF") // append 문자열 끝에 추가
                .insert(0, "ABC") // insert 처음에 ABC를 추가
                .delete(3, 4) // delete 3,4-1번째(3번만) 있는 문자열 지우기
                .toString(); // toString 완성된 문자열 리턴
        System.out.println(data); // "ABCEF"
    }
}
