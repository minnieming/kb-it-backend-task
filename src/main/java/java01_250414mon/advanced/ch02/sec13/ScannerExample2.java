package main.java.java01_250414mon.advanced.ch02.sec13;
import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in); // 스캐너 객체 생성
        String answer = null;

        do {
            answer = sc.nextLine();
            System.out.println("입력문자열:"+answer);
        } while (!answer.equals("q"));

        System.out.println("종료");
    }
}
