package main.java.java02_250415tue.basic.ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {

        // 길이 3짜리의 배열을 선언 및 생성
        String[] strArray = new String[3];

        // 각각에 값은 넣어줌
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println( strArray[0] == strArray[1] ); // true
        System.out.println( strArray[0] == strArray[2] ); // false
        System.out.println( strArray[0].equals(strArray[2]) ); // true
    }
}
