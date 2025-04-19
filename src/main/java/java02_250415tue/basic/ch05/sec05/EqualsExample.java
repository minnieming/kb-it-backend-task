package main.java.java02_250415tue.basic.ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        boolean address = strVar1 == strVar2;
//        System.out.println(address); // ture
        System.out.println("strVar1과 strVar2는 참조가 같음");

        boolean word = strVar1.equals(strVar2);
//        System.out.println(word); // true
        System.out.println("strVar1과 strVar2는 문자열이 같음");

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        boolean address2 = strVar3 == strVar4;
//        System.out.println(address2); // false
        System.out.println("strVar3과 strVar4는 참조가 다름");

        boolean word2 = strVar3.equals(strVar4);
//        System.out.println(word2); // true
        System.out.println("strVar3과 strVar4는 문자열이 같음");

    }
}
