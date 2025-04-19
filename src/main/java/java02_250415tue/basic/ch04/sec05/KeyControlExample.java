package main.java.java02_250415tue.basic.ch04.sec05;
import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 스캐너로 값을 가져오기

        int speed = 0;

        // while + switch
//        System.out.println("-------------------------");
//        System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//        System.out.println("-------------------------");
//
//        int selectNum = scanner.nextInt(); // 키보드에 어떤 값을 입력 받을지 정의하기
//
//        while (selectNum == 1 || selectNum == 2) {
//            System.out.println("선택:" + selectNum);
//            switch (selectNum) {
//                case 1 :
//                    speed += 1;
//                    break;
//                case 2 :
//                    speed -= 1;
//                    break;
//            }
//            System.out.println("현재 속도 = " + speed);
//
//            System.out.println("-------------------------");
//            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//            System.out.println("-------------------------");
//
//            selectNum = scanner.nextInt();
//        }
//        System.out.println("선택:" + selectNum);
//        System.out.println("프로그램 종료1");

        // do while

        int selectNum = 0;

        do {
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");

            selectNum = scanner.nextInt();

            switch (selectNum) {
                case 1 :
                    speed += 1;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case 2 :
                    speed -= 1;
                    System.out.println("현재 속도 = " + speed);
                    break;
            }
        } while (selectNum != 3);

        System.out.println("선택:" + selectNum);
        System.out.println("프로그램 종료1");

    }
}
