package main.java.java02_250415tue.basic.ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char check = ssn.charAt(6); // charAt()로 해당 부분의 글자를 가져올 수 있다.

        switch (check) {
            case '1', '3' :
                System.out.println("남자입니다.");
                break;
            case '2', '4' :
                System.out.println("여자입니다.");
                break;
        }
    }
}
