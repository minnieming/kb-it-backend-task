package main.java.java01_250414mon.basic.ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x); // x = 12
        System.out.println("-----------------------");

        y--;
        --y;
        System.out.println("y=" + y); // y = 8
        System.out.println("-----------------------");

        z = x++; // 선 연산(대입, 출력), 후 증가
        System.out.println("z=" + z); // z = 13 X -> z = 12 // x가 증가되기 전에 대입 연산자를 먼저 한다
        System.out.println("x=" + x); // x = 12 X -> x = 13 // z에 대입연산을 한 후에 x에 증가 연산자를 한다.
        System.out.println("-----------------------");

        z = ++x;
        System.out.println("z=" + z); // z = 14
        System.out.println("x=" + x); // x = 13 X -> x = 14
        System.out.println("-----------------------");

        z = ++x + y++;
        System.out.println("z=" + z); // z = 23 // 이때는 x = 15, y = 8인 상태에서 연산을 했다.
        System.out.println("x=" + x); // x = 14 X -> x = 15
        System.out.println("y=" + y); // y = 9
    }
}
