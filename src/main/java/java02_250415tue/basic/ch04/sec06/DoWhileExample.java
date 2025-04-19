package main.java.java02_250415tue.basic.ch04.sec06;
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String scan = null;

        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        do {
            scan = scanner.nextLine();

            System.out.println(">" + scan);
            System.out.println(scan);

        } while (!scan.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");


    }
}
