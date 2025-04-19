package main.java.java02_250415tue.basic.ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();

        switch (length) {
            case 13 :
                System.out.println("주민등록번호 자릿수가 맞습니다.");
                break;
            default:
                System.out.println("주민등록번호 자릿수가 틀립니다.");
                break;
        }
    }
}
