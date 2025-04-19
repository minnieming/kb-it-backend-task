package main.java.java02_250415tue.basic.ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA") ; // replace로 원하는 부분만 교체

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
