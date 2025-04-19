package main.java.java02_250415tue.basic.ch04.sec07;

public class BreakExample {
    public static void main(String[] args) throws Exception {

        int num = 0;

        do {
//            num = (int)(Math.random() * 6) +1;
            num = new java.util.Random().nextInt(6) +1; // Random 사용 방법
            System.out.println(num);
        } while (num != 6);
        System.out.println("프로그램 종료");
    }
}
