package main.java.java02_250415tue.advanced;
import java.util.Scanner;

public class adv08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scan = 0;
        int total = 0;
        int cost = 0;

        do {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");

            scan = scanner.nextInt();

            switch (scan) {
                case 1:
                    System.out.println("선택> " + scan);
                    cost = scanner.nextInt();
                    total += cost;
                    System.out.println("예금액>" + total);
                    break;
                case 2:
                    System.out.println("선택> " + scan);
                    cost = scanner.nextInt();
                    total -= cost;
                    System.out.println("출금액>" + total);
                    break;
                case 3:
                    System.out.println("선택> " + scan);
                    System.out.println("잔고>" + total);
                    break;
                case 4:
                    System.out.println("선택> " + scan);
                    break;
                default:
                    System.out.println("잘못된 값을 입력하셨습니다. 1~4번 중 하나를 다시 입력해주세요");
                    break;
            }
        } while (scan != 4);
        System.out.println("프로그램 종료");
    }
}
