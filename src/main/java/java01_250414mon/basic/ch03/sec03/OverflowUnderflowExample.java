package main.java.java01_250414mon.basic.ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) { // for문으로 5번 반복한다
            var1++; // 반복할때마다 var1에 1씩 더한다
            System.out.println("var1: " + var1); // 결과값 출력 (총 5번). -> 자신 범위의 값이 넘어가면 overflow가 발생해서 최저값으로 넘어간다.
        }
        System.out.println("-----------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) { // for문으로 5번 반복한다.
            var2--; // 반복할때마다 var2에 1씩 뺀다
            System.out.println("var2: " + var2); // 결과값 출력 (총 5번) -> 자신 범위의 값보다 적어지면 underflow가 발생해서 최고값으로 넘어간다.
        }
    }
}
