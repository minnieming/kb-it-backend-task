package main.java.java01_250414mon.basic.ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = 3;
        x = y; // 선언한 x에 새로운 값으로 재설정
        y = temp; // 위에서 선언했으므로 'int y =' 이런식으로 사용하지 않는다
        System.out.println("x:" + x + ", y:" + y);
    }
}
