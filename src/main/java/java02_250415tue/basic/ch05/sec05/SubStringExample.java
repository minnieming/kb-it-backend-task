package main.java.java02_250415tue.basic.ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7,14);
        System.out.println(secondNum);
    }
}
